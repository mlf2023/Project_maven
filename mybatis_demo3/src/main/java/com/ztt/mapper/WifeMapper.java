package com.ztt.mapper;

import com.ztt.pojo.Wife;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface WifeMapper {
    List<Wife> getHUsAndWifeInfo();
    @Select("select * from person_info.wife")
    @Results(id = "wifeLazyMap", value = {
            @Result(id = true, column = "wife_id", property = "wifeId"),
            @Result(column = "wife_name", property = "wifeName"),
            @Result(column = "hid", property = "hId"),
            @Result(column = "hid", property = "husband",
                    one = @One(select = "com.ztt.mapper.HusbandMapper.getHusbandById", fetchType = FetchType.LAZY))
    })
    List<Wife> getWifeAll();

}
