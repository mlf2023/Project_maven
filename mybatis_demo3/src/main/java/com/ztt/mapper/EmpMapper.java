package com.ztt.mapper;

import com.ztt.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface EmpMapper {

 Emp getEmpById(@Param("eid") Integer id);
 int insertEmp(Emp emp);
 void deleteEmpById(@Param("id") Integer id);

 @Delete("DELETE from emp where eid=#{id}")
 int deleteEmpByAnn(int id);
 @Select("SELECT * from emp where ename LIKE concat('%',#{name},'%')"+"AND epay>=#{starPay} AND epay<=#{endPay} ")
 List<Emp>selectEmpBySome(@Param("name") String ename,@Param("starPay") double starPay, @Param("endPay") double endPay);
 @Update("update emp set ename =#{ename},esex=#{esex},"+
         "epay=#{epay} where eid =#{eid}")
 int updateEmpById(Map<String,Object> map);
 //插入一条数据
 @Insert("insert into person_info.emp(ename,esex,estartime) values (#{ename},#{esex},#{estartime})")
 @Options(useGeneratedKeys = true, keyProperty = "eid")
 int insertEmpByAnn(Emp emp);
}
