package com.ztt.mapper;

import com.ztt.pojo.Orders;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper {
    @Select("select * from orders where userId=#{uId}")
    List<Orders> getOrdersByUId(Integer uId);
}
