package com.ztt.mapper;

import com.ztt.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from class,teacher,student where student_id=#{id} and student.classid=class.classid and class.teacherid = teacher.teacherid ")
    List<Teacher> getTeacherByClassId(Integer id);
}
