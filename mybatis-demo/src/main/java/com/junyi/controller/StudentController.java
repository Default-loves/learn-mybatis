package com.junyi.controller;

import com.junyi.dao.StudentDao;
import com.junyi.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @time: 2020/8/25 16:35
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
@RestController
@Slf4j
public class StudentController {
    @Autowired
    public StudentDao studentDao;

    @GetMapping("student")
    public List<Student> find() {
        List<Student> students = studentDao.findAll();
        students.forEach(System.out::println);
        return students;
    }
}
