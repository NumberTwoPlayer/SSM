package com.zhaozhao.spring.dao.Impl;

import com.zhaozhao.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author 刘梹晨
 * @Classname UserDaoImpl
 * @Date 2023/8/2 12:44
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
