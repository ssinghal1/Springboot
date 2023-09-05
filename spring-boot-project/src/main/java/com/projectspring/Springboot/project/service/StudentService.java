package com.projectspring.Springboot.project.service;

import com.projectspring.Springboot.project.entity.Student;

import java.util.List;

public interface StudentService {

    public void deletestudentbyid(long studentid);
    public Student saveStudent(Student student);


   public List<Student> fetchstudent();




    public Student getstudentbyid(long studentid);

   public Student updateStudentRecord(Long studentid, Student student);
}
