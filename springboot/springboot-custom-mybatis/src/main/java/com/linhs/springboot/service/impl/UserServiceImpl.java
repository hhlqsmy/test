package com.linhs.springboot.service.impl;

import com.linhs.springboot.mapper.UserMapper;
import com.linhs.springboot.pojo.User;
import com.linhs.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
