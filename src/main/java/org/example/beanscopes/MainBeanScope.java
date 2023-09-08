package org.example.beanscopes;

import org.example.pojo.Account;
import org.example.pojo.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscopeconfig/beans.xml");
        Account accountSingleton1 = applicationContext.getBean("account1", Account.class);
        accountSingleton1.setOwnerName("xxxxxxxxxxxxx");
        Account accountSingleton2 = applicationContext.getBean("account1",Account.class);
        System.out.println("account1: " + accountSingleton2.getOwnerName());

        Account accountPrototype1 = applicationContext.getBean("account2", Account.class);
        accountPrototype1.setOwnerName("yyyyyyyyyyyyyyyy");
        Account accountPrototype2 = applicationContext.getBean("account2",Account.class);
        System.out.println("account2:  " + accountPrototype2.getOwnerName());
    }
}