package com.zhaozhao.mybatis.test;

import com.zhaozhao.mybatis.mapper.SelectMapper;
import com.zhaozhao.mybatis.pojo.User;
import com.zhaozhao.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @author 刘梹晨
 * @Classname SelectMapperTest
 * @Date 2023/7/26 14:49
 */

public class SelectMapperTest {

    /**
     * Mybatis的各种查询功能
     * 1、若查询出的数据只有一条
     * a>可以通过实体类对象接收
     * b>可以通过List集合接收
     * c>可以通过map集合接收
     *结果：{password=123456, sex=?, id=1, age=20, email=123456@qq.com, username=zhaozhao}
     *
     * 2、若查询出的数据有多条
     * a>可以通过实体类类型的List集合接收
     * b>可以通过Map类型的List集合接收
     * c>可以在mapper接口的方法上添加@MapKey注解，此时就可以将每条数据转换的map集合作为值，以某个字段的值作为键，放在同一个map集合中
     * 注意：一定不能通过实体类对象接收
     *
     * Mybatis中设置了默认得到类型别名
     * Java.lang.Integer --> int,integer
     * int --> _int,_integer
     * map --> Map
     * String --> string
     */
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(1));
    }

    @Test
    public void testAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getCount());
    }

    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserByIdToMap(1));
    }

    @Test
    public void testGetAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        List<Map<String, Object>> list = mapper.getAllUserToMap();
//        list.forEach(System.out::println);
        System.out.println(mapper.getAllUserToMap());
    }

}
