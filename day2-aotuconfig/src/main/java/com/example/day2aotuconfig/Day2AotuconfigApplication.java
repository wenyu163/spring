package com.example.day2aotuconfig;

import cn.itcast.pojo.Province;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Day2AotuconfigApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =  SpringApplication.run(Day2AotuconfigApplication.class, args);
        System.out.printf(context.getBean("Country").toString());
    }


}
