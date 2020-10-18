package com.junyi.many2many.dao;

import com.junyi.many2many.entity.StudentLectureRef;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @time: 2020/8/25 17:45
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@Mapper
public interface StudentLectureRefDao {

    List<StudentLectureRef> findStudentLectureByStuId(Integer id);

    List<StudentLectureRef> findStudentLectureByLecId(Integer id);

}
