package com.zhaozhao.spring.controller;

import com.zhaozhao.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author 刘梹晨
 * @Classname UserController
 * @Date 2023/8/2 12:41
 */
@Controller("controller")
//@Controller
public class UserController {

    @Autowired
    //@Qualifier("userServiceImpl")
    private UserService userService;

    public void saveUser() {
        userService.saveUser();
    }
}
