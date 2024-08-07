package com.example.day1mybatis.service.impl;

import com.example.day1mybatis.mapper.UserMapper;
import com.example.day1mybatis.pojo.User;
import com.example.day1mybatis.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }
}
