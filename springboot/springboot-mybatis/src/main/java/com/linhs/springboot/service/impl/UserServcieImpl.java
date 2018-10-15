package com.linhs.springboot.service.impl;

import com.linhs.springboot.mapper.UserMapper;
import com.linhs.springboot.pojo.User;
import com.linhs.springboot.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServcieImpl implements UserServcie {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true, propagation = Propagation.REQUIRED)
    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void addUser(String userName) {
        jdbcTemplate.update("INSERT INTO t_user(user_name) VALUES (?)", userName);
    }
}
