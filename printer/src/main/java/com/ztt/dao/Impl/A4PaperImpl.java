package com.ztt.dao.Impl;

import com.ztt.dao.Paper;
import org.springframework.stereotype.Component;

public class A4PaperImpl implements Paper {
    @Override
    public void size() {
        System.out.println("A4纸");
    }
}
