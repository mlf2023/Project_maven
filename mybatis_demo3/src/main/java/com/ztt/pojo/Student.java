package com.ztt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2023-05-18 11:18:14
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = -44118591012462628L;
    
    private Integer studentId;
    
    private String studentname;
    
    private Integer classid;
    
    private Float score;

    private List<Teacher> teacherList;
}

