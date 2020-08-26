package com.junyi.one2many.dao;

import com.junyi.one2many.entity.Lecture;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @time: 2020/8/25 17:47
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Mapper
public interface LectureDao {

    Lecture findById(Integer id);

    List<Lecture> findAll();



}
