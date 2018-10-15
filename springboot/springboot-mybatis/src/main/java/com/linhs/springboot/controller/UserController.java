package com.linhs.springboot.controller;

import com.linhs.springboot.pojo.User;
import com.linhs.springboot.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServcie userServcie;

    @RequestMapping("/hello")
    public String hello() {
        int i = 10 / 0;
        return "hello";
    }

    @RequestMapping("/listUser")
    public List<User> listUser() {
        return userServcie.listUser();
    }

    @RequestMapping("/addUser")
    public String addUser(String userName) {
        userServcie.addUser(userName);
        return "success";
    }
}

