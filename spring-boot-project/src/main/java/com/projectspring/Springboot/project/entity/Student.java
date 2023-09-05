package com.projectspring.Springboot.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentid;
    private String studentname;
    private String Studentmajor;

    public Student() {
    }

    public Student(Long studentid, String studentname, String studentmajor) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.Studentmajor = studentmajor;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentmajor() {
        return Studentmajor;
    }

    public void setStudentmajor(String studentmajor) {
        Studentmajor = studentmajor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", Studentmajor='" + Studentmajor + '\'' +
                '}';
    }
}

