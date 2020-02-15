package com.xuzhang.mybatisnestedobjectquery.mapper;

import com.xuzhang.mybatisnestedobjectquery.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUserMapper {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = userMapper.findUserById(1L);
        System.out.println(1);
    }

    @Test
    public void test2(){
        User user = userMapper.findUserRole();
        System.out.println(1);
    }
}
