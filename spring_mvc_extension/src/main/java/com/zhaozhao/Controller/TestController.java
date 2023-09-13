package com.zhaozhao.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 刘梹晨
 * @Classname TestController
 * @Date 2023/8/19 14:26
 */
@Controller
public class TestController {
    @RequestMapping("/test/hello")
    public String TestHello(){
        return "success";
    }
}
