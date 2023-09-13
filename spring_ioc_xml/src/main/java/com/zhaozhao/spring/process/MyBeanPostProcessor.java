package com.zhaozhao.spring.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 刘梹晨
 * @Classname MyBeanPostProcessor
 * @Date 2023/8/1 18:13
 */

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    //此方法在bean的生命周期初始化之前执行
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor ---> 后置处理器postProcessBeforeInitialization");
        return bean;
    }

    @Override
    //此方法在bean的生命周期初始化之后执行
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor ---> 后置处理器postProcessAfterInitialization");
        return bean;
    }
}
