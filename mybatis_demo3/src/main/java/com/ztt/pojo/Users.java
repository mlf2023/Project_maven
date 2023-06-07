package com.ztt.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * (Users)实体类
 *
 * @author zhaojing
 * @since 2023-01-10 14:19:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users implements Serializable {
    private static final long serialVersionUID = -19615450950487424L;
    /**
     * 主键
     */
    private Object id;
    /**
     * 用户名
     */
    private String uName;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    private List<Orders> ordersList;

}

