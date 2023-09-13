package com.zhaozhao.spring.test;

import com.zhaozhao.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 刘梹晨
 * @Classname LifeCycleTest
 * @Date 2023/8/1 17:52
 */

public class LifeCycleTest {

    /**
     * 1、实例化
     * 2、依赖注入
     * 3、后置处理器postProcessBeforeInitialization
     * 4、初始化，需要通过bean的init-method属性指定初始化的方法
     * 5、后置处理器postProcessAfterInitialization
     * 6、IOC容器关闭时销毁，需要通过bean的destroy-method属性指定销毁的方法
     *
     * 注意：
     * 若bean的作用域为单例时，生命周期的前三个步骤会在获取IOC容器
     */

    @Test
    public void test(){
        ConfigurableApplicationContext ioc =  new ClassPathXmlApplicationContext("spring-lifecycle.xml");
//        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }
}
