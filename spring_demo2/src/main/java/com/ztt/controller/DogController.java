package com.ztt.controller;

import com.ztt.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DogController {
    @Autowired
    private DogService dogService=null;
    public void getDog(){
        dogService.getDog();
    }
}
