package com.linhs.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/hello")
    public String hello(){
        stringRedisTemplate.opsForValue().set("name","linhs");
        return "hello";
    }
}
