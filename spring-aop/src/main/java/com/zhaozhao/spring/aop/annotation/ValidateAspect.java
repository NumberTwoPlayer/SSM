package com.zhaozhao.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 刘梹晨
 * @Classname ValidateAspect
 * @Date 2023/8/6 12:56
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {
//    @Pointcut("execution(* com.zhaozhao.spring.aop.annotation.CalculatorImpl.*(..))")
//    public void pointCut(){}

    @Before("com.zhaozhao.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect --> 前置通知");
    }
}
