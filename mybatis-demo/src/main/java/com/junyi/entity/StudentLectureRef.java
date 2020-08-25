package com.junyi.entity;

/**
 * @time: 2020/8/25 17:38
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class StudentLectureRef {
    private Student student;
    private Lecture lecture;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }
}
