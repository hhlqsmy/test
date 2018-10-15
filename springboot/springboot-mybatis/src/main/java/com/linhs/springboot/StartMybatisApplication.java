package com.linhs.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.linhs.springboot.mapper")
public class StartMybatisApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(StartMybatisApplication.class);
        application.run(args);
    }
}
