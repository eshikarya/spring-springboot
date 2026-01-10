package com.example.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle{
    @Override
    public String start() {
        return "Car Starts";
    }
}
