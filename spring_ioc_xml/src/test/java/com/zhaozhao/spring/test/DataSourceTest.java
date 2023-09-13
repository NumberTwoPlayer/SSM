package com.zhaozhao.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 刘梹晨
 * @Classname DataSourceTest
 * @Date 2023/8/1 15:31
 */

public class DataSourceTest {
    @Test
    public void testDataSource(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource dataSource = ioc.getBean(DruidDataSource.class);
        System.out.println(dataSource.getCloseCount());
    }
}
