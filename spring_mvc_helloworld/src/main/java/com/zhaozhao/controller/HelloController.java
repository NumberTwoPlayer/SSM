package com.zhaozhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 刘梹晨
 * @Classname HelloController
 * @Date 2023/8/8 15:04
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String protal(){
        //将逻辑视图返回
        return "index";
    }
    @RequestMapping("hello")
    public String hello(){
        return "success";
    }

}
