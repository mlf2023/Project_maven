package com.ztt.dao.Impl;

import com.ztt.dao.InkBox;
import org.springframework.stereotype.Component;

public class ColorInkBoxImpl implements InkBox {
    @Override
    public void color() {
        System.out.println("彩色墨盒");
    }
}
