package com.zhaozhao.spring.service.Impl;

import com.zhaozhao.spring.dao.UserDao;
import com.zhaozhao.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author 刘梹晨
 * @Classname UserServiceImpl
 * @Date 2023/8/2 12:43
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    //@Qualifier("userDaoImpl")
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
