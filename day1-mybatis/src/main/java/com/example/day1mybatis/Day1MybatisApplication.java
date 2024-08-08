package com.example.day1mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = {"com.example.day1mybatis.mapper"})
public class Day1MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day1MybatisApplication.class, args);
    }

}
