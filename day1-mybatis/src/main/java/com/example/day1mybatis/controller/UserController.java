package com.example.day1mybatis.controller;

import com.example.day1mybatis.pojo.User;
import com.example.day1mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findById")
    public User findById(Integer id){
        return userService.getUserById(id);
    };
}
