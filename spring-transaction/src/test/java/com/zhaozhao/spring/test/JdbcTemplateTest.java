package com.zhaozhao.spring.test;

import com.zhaozhao.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 刘梹晨
 * @Classname JdbcTemplateTest
 * @Date 2023/8/6 14:46
 */
//指定当前测试类在Spring的测试环境中执行，此时就可以通过注入的方法直接获取IOC容器中bean
@RunWith(value = SpringJUnit4ClassRunner.class)
//设置Spring测试关键的配置文件
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert() {
        String sql = "insert into t_user values(null,?,?,?,?,?)";
        int result = jdbcTemplate.update(sql, "root", "123", "女", "女", "123@qq.com");
        System.out.println(result);
    }

    @Test
    public void testGetUserById(){
        String sql = "select * from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser(){
        String sql = "select * from t_user";
        List<User> user = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        user.forEach(System.out::println);
    }

    @Test
    public void testGetCount(){
        String sql = "select count(*) from t_user";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);

    }
}
