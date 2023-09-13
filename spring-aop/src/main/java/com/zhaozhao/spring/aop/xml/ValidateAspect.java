package com.zhaozhao.spring.aop.xml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 刘梹晨
 * @Classname ValidateAspect
 * @Date 2023/8/6 12:56
 */
@Component
public class ValidateAspect {
    public void beforeMethod(){
        System.out.println("ValidateAspect --> 前置通知");
    }
}
