package com.zhao.mybatis.test;

import com.zhao.mybatis.mapper.CacheMapper;
import com.zhao.mybatis.pojo.Emp;
import com.zhao.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 刘梹晨
 * @Classname CacheMapperTest
 * @Date 2023/7/29 0:34
 */

public class CacheMapperTest {
    @Test
    public void testOneCache(){
        SqlSession sqlSession1 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpByEid(5);
        System.out.println(emp1);
        //mapper1.insertEmp(new Emp(null,"zhao",21,"女","123321@qq.com"));
        sqlSession1.clearCache();
        Emp emp2 = mapper1.getEmpByEid(5);
        System.out.println(emp2);
//        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
//        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
//        Emp emp2 = mapper2.getEmpByEid(5);
//        System.out.println(emp2);
    }

    @Test
    public void testTwoCache(){
        try {
            InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

            SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            System.out.println(mapper1.getEmpByEid(5));
            sqlSession1.close();

            SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            System.out.println(mapper2.getEmpByEid(5));
            sqlSession2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
