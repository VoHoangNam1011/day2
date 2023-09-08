package org.example.beanlifecycles;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifeconfig/beans.xml");
        context.close();
    }
}
