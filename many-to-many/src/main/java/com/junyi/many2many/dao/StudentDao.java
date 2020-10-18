package com.junyi.many2many.dao;

import com.junyi.many2many.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @time: 2020/8/25 16:22
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Mapper
public interface StudentDao {

    Student findById(Integer id);

    List<Student> find1();

    List<Student> find2();
}
