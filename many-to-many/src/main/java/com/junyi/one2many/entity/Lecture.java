package com.junyi.one2many.entity;

import java.util.List;

/**
 * @time: 2020/8/25 17:36
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Lecture {
    private Integer id;
    private String name;
    private List<Student> studentLectureRefList;    // Student 和 Lecture 是多对多

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentLectureRefList() {
        return studentLectureRefList;
    }

    public void setStudentLectureRefList(List<Student> studentLectureRefList) {
        this.studentLectureRefList = studentLectureRefList;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentLectureRefList=" + studentLectureRefList +
                '}';
    }
}
