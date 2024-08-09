package com.example.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.List;

@AutoConfiguration
public class MybatisAutoConfig {

    @Bean
    public SqlSessionFactoryBean sessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean =  new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    };
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(BeanFactory beanFactory) {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //扫描启动包与子包
       List<String> packages = AutoConfigurationPackages.get(beanFactory);
        String p  = packages.get(0);
        mapperScannerConfigurer.setBasePackage(p);

        //扫描注解
        mapperScannerConfigurer.setAnnotationClass(Mapper.class);

        return mapperScannerConfigurer;
    }
}
