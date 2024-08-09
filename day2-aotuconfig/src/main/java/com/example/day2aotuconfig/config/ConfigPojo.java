package com.example.day2aotuconfig.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPojo {
    @Bean
    public Province Province(){
        return  new Province();
    }

    @Bean
    public Country Country(@Value("${country.name}") String name,@Value("${country.system}") String system){
        return new Country(name,system);
    }
}
