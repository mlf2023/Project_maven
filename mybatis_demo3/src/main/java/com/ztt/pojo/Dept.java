package com.ztt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dept implements Serializable {
    private static final long serialVersionUID = 372981646177803083L;

    private Integer id;

    private String brandName;

    private String companyName;

    private Integer ordered;

    private String description;

    //本身返回：1 和 0
    //想返回：启用 和 禁用
    private Integer status;

    private Date createDate;

}
