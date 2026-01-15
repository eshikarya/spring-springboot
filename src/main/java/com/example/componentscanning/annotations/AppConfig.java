package com.example.componentscanning.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.componentscanning.annotations")
public class AppConfig {
}
