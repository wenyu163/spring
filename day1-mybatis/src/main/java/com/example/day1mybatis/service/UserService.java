package com.example.day1mybatis.service;

import com.example.day1mybatis.pojo.User;

import java.util.List;

public interface UserService {
    public User getUserById(Integer id);

    public List<User> getAllUsers();
}
