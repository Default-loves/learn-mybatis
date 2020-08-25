package com.junyi.dao;

import com.junyi.entity.Student;
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

    public List<Student> findAll();

}
