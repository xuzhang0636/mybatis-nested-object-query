package com.xuzhang.mybatisnestedobjectquery.controller;

import com.xuzhang.mybatisnestedobjectquery.mapper.UserMapper;
import com.xuzhang.mybatisnestedobjectquery.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public String hello() {
        User user = userMapper.findUserById(1L);
        return "hello";
    }
}
