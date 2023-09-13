package com.chen.mybatis.test;

import com.chen.mybatis.mapper.EmpMapper;
import com.chen.mybatis.pojo.Emp;
import com.chen.mybatis.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 刘梹晨
 * @Classname MBGTest
 * @Date 2023/7/29 15:26
 */

public class MBGTest {
    @Test
    public void testMBG(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            //查询所有数据
//            List<Emp> list = mapper.selectByExample(null);
//            list.forEach(System.out::println);

            //根据条件查询
//            EmpExample example = new EmpExample();
//            example.createCriteria().andEmpNameEqualTo("chen").andAgeLessThanOrEqualTo(20);
//            example.or().andDidIsNotNull();
//            List<Emp> list = mapper.selectByExample(example);
//            list.forEach(System.out::println);

            mapper.updateByPrimaryKeySelective(new Emp(5,"zhaozhao",20,"女","123456@qq.com",1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
