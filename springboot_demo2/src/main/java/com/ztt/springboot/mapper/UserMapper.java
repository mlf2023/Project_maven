package com.ztt.springboot.mapper;

import com.ztt.springboot.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    @Select("select * from user")
    List<User> getUser();
}
