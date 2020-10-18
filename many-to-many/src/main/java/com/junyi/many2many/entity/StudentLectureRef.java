package com.junyi.many2many.entity;

/**
 * @time: 2020/8/25 17:38
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class StudentLectureRef {
    private Integer lectureId;
    private Integer studentId;
    private float score;
    private Lecture lecture;
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    @Override
    public String toString() {
        return "StudentLectureRef{" +
                "lectureId=" + lectureId +
                ", studentId=" + studentId +
                ", score=" + score +
                ", lecture=" + lecture +
                '}';
    }
}
