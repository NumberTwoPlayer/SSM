package com.zhaozhao.mybatis.test;

import com.zhaozhao.mybatis.mapper.ParameterMapper;
import com.zhaozhao.mybatis.pojo.User;
import com.zhaozhao.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Class.forName;

/**
 * @author 刘梹晨
 * @Classname ParameterMapperTest
 * @Date 2023/7/25 23:17
 */

public class ParameterMapperTest {

    /**
     * Mybatis 获取参数值的两种方式：${}和 #{}
     * ${}本质字符串拼接
     * #{}本质占位符赋值
     *
     * Mybatis 获取参数值的各种情况：
     * 1、mapper接口方法的参数为单个的字面量类型
     *  可以通过${}和#{}以任意的字符串获取参数值，但是需要注意${}和#{}的单引号问题
     *
     * 2、mapper接口方法的参数为多个时
     *  此时Mybatis会将这些参数放在一个map集合中，以两种方式进行储存
     *  a>以arg0,arg1...为键，以参数为值
     *  b>以param1,param2...为键，以参数为值
     *  因此只需要通过#{}和${}以键的方式访问值即可，但是需要注意${}的单引号问题
     *
     * 3、若mapper接口的方法的参数有多个时，可以手动将这些参数放在一个map中
     *  只需要通过#{}和${}以键的方式访问值即可，但是需要注意${}的单引号问题
     *
     * 4、mapper接口方法的参数是实体类类型的参数
     *  只需要通过#{}和${}以属性的方式访问属性值即可，但是需要注意${}的单引号问题
     *
     * 5、使用@Param注解命名参数
     *  此时Mybatis会将这些参数放在一个map集合中，以两种方式进行储存
     *  a>以@Param注解的值为键，以参数为值
     *  b>以param1,param2...为键，以参数为值
     *  只需要通过#{}和${}以属性的方式访问属性值即可，但是需要注意${}的单引号问题
     */
    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(user -> System.out.println(user));
//        allUser.forEach(System.out::println);

    }

    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.GetUserByUsername("zhaozhao");
        System.out.println(user);

    }

    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("zhaozhao","123456");
        System.out.println(user);
    }

    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username","zhaozhao");
        map.put("password","123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);

    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        int result = mapper.insertUser(new User(null, "chen", "123", 21, "男", "654321@qq.com"));
        System.out.println(result);

    }

    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLoginByParam("zhaozhao","123456");
        System.out.println(user);
    }
}
