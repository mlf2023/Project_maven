package com.ztt.mapper;

import com.ztt.pojo.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    @Select("select * from tb_brand")
    List<Brand> getBrandAll();
}
