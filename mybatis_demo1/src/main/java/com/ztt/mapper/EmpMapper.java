package com.ztt.mapper;

import com.ztt.pojo.Emp;
import org.apache.ibatis.annotations.Param;
public interface EmpMapper {
 /**
  * @param id
  * @return
  */
 Emp getEmpById(@Param("eid") Integer id);
 int insertEmp(Emp emp);
 void deleteEmpById(@Param("id") Integer id);
}
