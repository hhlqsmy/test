package com.linhs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartRedisApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(StartRedisApplication.class);
        application.run(args);
    }
}
