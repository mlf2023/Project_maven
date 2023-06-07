package com.ztt.mapper;

import com.ztt.pojo.Husband;
import org.apache.ibatis.annotations.Select;

public interface HusbandMapper {
    @Select("select * from husband where hus_id =#{id} ")
    Husband getHusbandById(Integer id);
}
