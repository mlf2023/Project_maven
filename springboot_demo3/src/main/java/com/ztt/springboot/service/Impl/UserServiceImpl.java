package com.ztt.springboot.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ztt.springboot.mapper.UserMapper;
import com.ztt.springboot.pojo.User;
import com.ztt.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
