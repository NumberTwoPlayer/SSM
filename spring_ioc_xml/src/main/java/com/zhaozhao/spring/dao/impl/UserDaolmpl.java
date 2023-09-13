package com.zhaozhao.spring.dao.impl;

import com.zhaozhao.spring.dao.UserDao;

/**
 * @author 刘梹晨
 * @Classname UserDaolmpl
 * @Date 2023/8/2 6:53
 */

public class UserDaolmpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
