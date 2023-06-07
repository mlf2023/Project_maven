package com.ztt.springboot.controller;

import com.ztt.springboot.pojo.Person;
import com.ztt.springboot.pojo.User;
import com.ztt.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private Person person;
    @Autowired
    private UserService userService;
    @Value("${person.username}")
    private String username;
    @GetMapping("/hello")
    public String hello(){
        return "hello,springboot!";
    }
    @GetMapping("/person")
    public Person Person(){
        System.out.println(person);
        return person;
    }
    @GetMapping("/good")
    public String good(){
        System.out.println(username);
        return "hello";
    }
    @GetMapping("/getUser")
    public List<User> getUser(){
        return userService.findUser();
    }

}
