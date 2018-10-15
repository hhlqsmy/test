package com.linhs.springboot.service;

import com.linhs.springboot.pojo.User;

import java.util.List;

public interface UserServcie {
    List<User> listUser();

    void addUser(String userName);
}
