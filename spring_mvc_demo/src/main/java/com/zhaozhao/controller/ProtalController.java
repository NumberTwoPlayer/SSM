package com.zhaozhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 刘梹晨
 * @Classname ProtalController
 * @Date 2023/8/10 14:09
 */
@Controller
public class ProtalController {
    @RequestMapping("/")
    public String protal(){
        return "index";
    }
}
