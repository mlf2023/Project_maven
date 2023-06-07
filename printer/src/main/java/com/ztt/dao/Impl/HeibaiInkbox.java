package com.ztt.dao.Impl;

import com.ztt.dao.InkBox;
import org.springframework.stereotype.Component;

public class HeibaiInkbox implements InkBox  {

    @Override
    public void color() {
        System.out.println("黑白墨盒");
    }
}
