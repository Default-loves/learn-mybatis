package com.junyi.one2many.controller;

import com.junyi.one2many.dao.LectureDao;
import com.junyi.one2many.entity.Lecture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class LectureController {
    @Autowired
    public LectureDao lectureDao;

    @GetMapping("lecture")
    public List<Lecture> find() {
        List<Lecture> lectures = lectureDao.findAll();
        lectures.forEach(System.out::println);
        return lectures;
    }
    @GetMapping("lecture/{lecture_id}")
    public Lecture find(@PathVariable("lecture_id") Integer lectureId) {
        Lecture lecture = lectureDao.findById(lectureId);
        log.info(lecture.toString());
        return lecture;
    }
}
