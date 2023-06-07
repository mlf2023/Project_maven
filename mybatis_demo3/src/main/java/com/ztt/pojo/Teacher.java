package com.ztt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2023-05-18 11:18:14
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Teacher implements Serializable {
    private static final long serialVersionUID = 675781364661860131L;
    
    private Integer teacherid;
    
    private String teachername;


}

