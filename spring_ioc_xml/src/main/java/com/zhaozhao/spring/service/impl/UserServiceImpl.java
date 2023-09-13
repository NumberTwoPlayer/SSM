package com.zhaozhao.spring.service.impl;

import com.zhaozhao.spring.dao.UserDao;
import com.zhaozhao.spring.service.UserService;

/**
 * @author 刘梹晨
 * @Classname UserServiceImpl
 * @Date 2023/8/2 6:52
 */

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
