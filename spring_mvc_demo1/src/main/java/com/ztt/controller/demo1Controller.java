package com.ztt.controller;

import com.ztt.pojo.People;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/demo1")
public class demo1Controller {
    @RequestMapping("/Map")
    public String viemMap(Map<String, Object> map){
        People people=new People(12,"123@qq.com","卢大佬");
        map.put("ldl",people);
        return "showPeople";
    }
}
