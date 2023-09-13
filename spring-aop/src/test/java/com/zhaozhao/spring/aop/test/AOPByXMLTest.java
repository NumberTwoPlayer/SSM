package com.zhaozhao.spring.aop.test;

import com.zhaozhao.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 刘梹晨
 * @Classname AOPByXMLTest
 * @Date 2023/8/6 13:23
 */

public class AOPByXMLTest {

    @Test
    public void testAOPByXML(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(10,0);
    }
}
