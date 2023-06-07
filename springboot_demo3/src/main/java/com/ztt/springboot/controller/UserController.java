package com.ztt.springboot.controller;

import com.ztt.springboot.mapper.UserMapper;
import com.ztt.springboot.pojo.User;
import com.ztt.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
@Autowired
    private UserService service;
@GetMapping("/getUser")
    public List<User> getUser(){
    List<User> list = service.list();
    System.out.println(list);
    return list;
}
}
