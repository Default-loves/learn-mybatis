package com.junyi.many2many.controller;

import com.junyi.many2many.dao.StudentDao;
import com.junyi.many2many.entity.Student;
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

    @GetMapping("find2")
    public List<Student> find2() {
        List<Student> students = studentDao.find2();
        students.forEach(System.out::println);
        return students;
    }

    @GetMapping("find1")
    public List<Student> find1() {
        List<Student> students = studentDao.find1();
        students.forEach(System.out::println);
        return students;
    }
}
