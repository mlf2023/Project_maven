package com.ztt.dao.Impl;

import com.ztt.dao.DogDao;
import org.springframework.stereotype.Repository;

@Repository
public class DogDaoImpl implements DogDao {
    @Override
    public void getDog() {
        System.out.println("汪汪");
    }
}
