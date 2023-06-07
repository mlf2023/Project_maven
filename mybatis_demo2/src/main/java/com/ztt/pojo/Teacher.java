package com.ztt.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
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

