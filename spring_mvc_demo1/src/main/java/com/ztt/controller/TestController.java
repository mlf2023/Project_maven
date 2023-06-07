package com.ztt.controller;

import com.ztt.pojo.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("/word")
    public String helloMVC(@RequestParam(value = "user",required = false) String user,Model model){
        System.out.println(user);
        model.addAttribute("hello","卢雨桐别卷了");
        model.addAttribute("zyx","张宇轩别卷了");
        model.addAttribute("back","后面四位别卷了");
        return "success";
    }
    @RequestMapping("/test/pojo/{zyx}")
    public String pojo(@PathVariable String zyx){
        System.out.println(zyx);
        return "success";
    }
    @GetMapping("/showView")
    public String showView(Model model){
        People people=new People(12,"123@qq.com","zhangshan");
        model.addAttribute("user",people);
        return "view";
    }

}
