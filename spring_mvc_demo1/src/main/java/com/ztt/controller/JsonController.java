package com.ztt.controller;

import com.ztt.pojo.People;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/json")
public class JsonController {

  @RequestMapping("/js")
    public String showJson(){
      return "hello,json";
  }


  @GetMapping("/getUser")
  public People getPeople(){
    People people=new People(12,"123@qq.com","卢大佬");
    return people;
  }
//  @ResponseBody
  @RequestMapping("/getPeopleList")
  public List<People> getPeopleList(){
  List<People> peopleList= Arrays.asList(
          new People(12,"123@qq.com","卢大佬"),
          new People(13,"123@qq.com","张大佬"),
          new People(12,"123@qq.com","严大佬"),
          new People(12,"123@qq.com","周大佬"),
          new People(12,"123@qq.com","崔大佬")
  );
  return peopleList;
  }
//  @ResponseBody
  @RequestMapping("getPeopleMap")
  public Map<String,Object> getPeopleMap(){
    Map<String,Object> map=null;
    try {
      map=new HashMap<>();
      List<People> peopleList= Arrays.asList(
              new People(12,"123@qq.com","卢大佬"),
              new People(13,"123@qq.com","张大佬"),
              new People(12,"123@qq.com","严大佬"),
              new People(12,"123@qq.com","周大佬"),
              new People(12,"123@qq.com","崔大佬")
      );
      map.put("data",peopleList);
      map.put("msg","数据成功返回");
      map.put("code",200);
    } catch (Exception e) {
      e.printStackTrace();
      map.put("data",null);
      map.put("msg","数据成功失败");
      map.put("code",500);
    }
    return map;
  }
    @PostMapping("/getPeopleJson")
//    @ResponseBody
  public String getPeopleJson(@RequestBody People people){
      System.out.println(people);
    return "ok";
    }
}
