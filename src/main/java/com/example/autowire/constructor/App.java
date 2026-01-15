package com.example.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByConstructor.xml");

        Car carObj = (Car) context.getBean("myCar");
        System.out.println(carObj.carDetails());
    }
}
