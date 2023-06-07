package com.ztt.springboot;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ztt.springboot.pojo.User;
import com.ztt.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootDemo2ApplicationTests {
    @Autowired
    UserService userService;

    @Test

        void contextLoads(){
            PageHelper.startPage(2,5);
            List<User> user = userService.findUser();
            PageInfo<User> pageInfo=new PageInfo<>(user);
            List<User> users=pageInfo.getList();
            users.forEach(System.out::println);
    }

}
