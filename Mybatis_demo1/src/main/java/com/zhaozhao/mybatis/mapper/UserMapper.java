package com.zhaozhao.mybatis.mapper;

import com.zhaozhao.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    /**
     * Mybatis 面向接口编程的两个一致：
     *  1、映射问的 namespace 要和 mapper 接口的全类名保持一致
     *  2、映射文件中 SQL 语句的 id 要和 mapper 接口中的方法保持一致
     *
     *  表 -- 实体类 --mapper接口 -- 映射文件
     */

    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     *删除用户信息
     */
    void deleteUser();

    /**
     *  根据id查询用户信息
     */
    User getUserById();

    /**
     * 查询所有的用户信息
     */
    List<User> getAlluser();
}
