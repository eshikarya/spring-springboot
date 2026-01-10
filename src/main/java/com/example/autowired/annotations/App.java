package com.example.autowired.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);

        Manager manager = context.getBean("manager",Manager.class);
        System.out.println(manager);

    }
}
