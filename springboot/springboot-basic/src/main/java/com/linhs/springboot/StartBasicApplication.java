package com.linhs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartBasicApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(StartBasicApplication.class);
        application.run(args);

    }
}
