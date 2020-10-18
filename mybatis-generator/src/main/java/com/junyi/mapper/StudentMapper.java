package com.junyi.mapper;

import com.junyi.entity.Student;
import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    Student selectByPrimaryKey(Integer stuId);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);
}