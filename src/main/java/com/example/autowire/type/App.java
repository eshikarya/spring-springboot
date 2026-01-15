package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByType.xml");

        Car carObj = (Car) context.getBean("myCar");
        System.out.println(carObj.carDetails());
    }
}
