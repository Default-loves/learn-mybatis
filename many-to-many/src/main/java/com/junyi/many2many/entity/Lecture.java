package com.junyi.many2many.entity;

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
    private List<Student> students;    // Student 和 Lecture 是多对多


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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
