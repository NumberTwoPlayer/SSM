package com.zhaozhao.spring.aop.test;

import com.zhaozhao.spring.aop.annotation.Calculator;
import com.zhaozhao.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 刘梹晨
 * @Classname AOPTest
 * @Date 2023/8/5 17:20
 */

public class AOPByAnnotationTest {
    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(10,1);
    }
}
