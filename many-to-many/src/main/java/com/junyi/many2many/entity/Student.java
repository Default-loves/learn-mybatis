package com.junyi.many2many.entity;

import java.util.List;

/**
 * @time: 2020/8/25 15:46
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Double money;
    private List<StudentLectureRef> studentLectureRef;    // Student 和 Lecture 是多对多



    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

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

    public List<com.junyi.many2many.entity.StudentLectureRef> getStudentLectureRef() {
        return studentLectureRef;
    }

    public void setStudentLectureRef(List<com.junyi.many2many.entity.StudentLectureRef> studentLectureRef) {
        this.studentLectureRef = studentLectureRef;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", StudentLectureRef=" + studentLectureRef +
                '}';
    }
}
