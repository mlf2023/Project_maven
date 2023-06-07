package com.ztt.springboot.service.Impl;

import com.ztt.springboot.mapper.UserMapper;
import com.ztt.springboot.pojo.User;
import com.ztt.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> findUser(){
        return userMapper.getUser();
    }
}

