package com.chen.mybatis.test;

import com.chen.mybatis.mapper.EmpMapper;
import com.chen.mybatis.pojo.Emp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
 * @Classname PageHelperTest
 * @Date 2023/7/29 16:33
 */

public class PageHelperTest {
    /**
     * limit index，pageSize
     * index：当前页的起始索引
     * pageSize：每页显示的条数
     * pageNum：当前页的页码
     * index = （pageNum - 1） * pageSize
     *
     * 使用mybatis的分页插件实现分页功能：
     * 1、需要在查询功能之前开启分页
     *  PageHelper.startPage(int pageNum, int pageSize);
     * 2、在查询功能之后获取分页信息
     *  PageInfo<Emp> page = new PageInfo<>(list, 1);
     *  list表示分页数据
     *  5表示当前导航分页的数量
     *
     */
    @Test
    public void testPageHelper(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            PageHelper.startPage(2,1);
            List<Emp> list = mapper.selectByExample(null);
            PageInfo<Emp> page = new PageInfo<>(list, 1);
            System.out.println(page);
//            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
