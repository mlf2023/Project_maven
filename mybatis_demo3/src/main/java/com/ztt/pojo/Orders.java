package com.ztt.pojo;


import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * (Orders)实体类
 *
 * @author zhaojing
 * @since 2023-01-10 14:19:20
 */
@Data
@ToString
public class Orders implements Serializable {
    private static final long serialVersionUID = 805975251603406279L;
    /**
     * 主键
     */
    private Integer orderId;
    /**
     * 订单描述
     */
    private String remark;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 订单价格
     */
    private Float cost;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 用户id(购买者)
     */
    private Long userId;
    /**
     * 用户
     */
    private String uName;



}

