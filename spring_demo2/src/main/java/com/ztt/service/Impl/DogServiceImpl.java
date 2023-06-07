package com.ztt.service.Impl;

import com.ztt.dao.DogDao;
import com.ztt.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    private DogDao dogDao=null;
    public void getDog(){
        dogDao.getDog();
    }
}
