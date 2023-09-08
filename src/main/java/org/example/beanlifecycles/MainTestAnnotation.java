package org.example.beanlifecycles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annoconfig/beans.xml");
        context.close();
    }
}