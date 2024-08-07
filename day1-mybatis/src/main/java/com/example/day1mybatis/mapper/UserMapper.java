package com.example.day1mybatis.mapper;

import com.example.day1mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from  user where  id = #{id}")
    public User findById(Integer id);
}
