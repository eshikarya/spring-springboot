package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");

        UserManager userManagerWithUserWebServiceProvider = (UserManager) context.getBean("userManagerWithUserWebServiceProvider");
        UserManager userManagerWithUserDatabaseProvider = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");

        System.out.println(userManagerWithUserWebServiceProvider.getUserInfo());
        System.out.println(userManagerWithUserDatabaseProvider.getUserInfo());
    }
}
