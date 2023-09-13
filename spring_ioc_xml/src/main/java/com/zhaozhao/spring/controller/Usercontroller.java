package com.zhaozhao.spring.controller;

import com.zhaozhao.spring.service.UserService;
import com.zhaozhao.spring.service.impl.UserServiceImpl;

/**
 * @author 刘梹晨
 * @Classname Usercontroller
 * @Date 2023/8/2 6:51
 */

public class Usercontroller {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void saveUser(){
        userService.saveUser();
    }
}
