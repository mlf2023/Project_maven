package com.ztt.service;

import com.ztt.dao.InkBox;
import com.ztt.dao.Paper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Printer {

    private InkBox inkBox;

    private Paper paper;
    public void print(){
        System.out.println("开始打印...");
        System.out.print("墨盒:");
        inkBox.color();
        System.out.print("纸张:");
        paper.size();
        System.out.println("打印结束。");
    }
}
