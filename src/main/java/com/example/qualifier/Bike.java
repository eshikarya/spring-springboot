package com.example.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    @Override
    public String start() {
        return "Bike Starts";
    }
}
