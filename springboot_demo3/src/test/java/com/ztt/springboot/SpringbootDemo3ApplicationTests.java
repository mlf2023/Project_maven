package com.ztt.springboot;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ztt.springboot.mapper.UserMapper;
import com.ztt.springboot.pojo.User;
import com.ztt.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.util.List;

@SpringBootTest
class SpringbootDemo3ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.likeRight("name","J");
        List<User> userList=userMapper.selectList(userQueryWrapper);
        userList.forEach(System.out::println);
    }
    @Test
    void Test01(){
        LambdaQueryWrapper<User> wrapper=new LambdaQueryWrapper<>();
        wrapper.like(User::getName,"J").orderByDesc(User::getId);
        List<User> list =userService.list(wrapper);
        list.forEach(System.out::println);

    }
    @Test
    void Test02(){
        IPage iPage= new Page<User>(2,3);
        userService.page(iPage);
        System.out.println(iPage.getRecords());
        System.out.println(iPage.getPages());
        System.out.println(iPage.getTotal());
    }

}
