package com.projectspring.Springboot.project.service;

import com.projectspring.Springboot.project.entity.Student;
import com.projectspring.Springboot.project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void deletestudentbyid(long studentid) {

        studentRepository.deleteById(studentid);
    }

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);


    }
    @Override
    public List<Student> fetchstudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getstudentbyid(long studentid) {
        return studentRepository.findById(studentid).get();
    }

    @Override
    public Student updateStudentRecord(Long studentid, Student student) {
        Student studb= studentRepository.findById(studentid).get();

        if(Objects.nonNull(student.getStudentname()) && !"".equalsIgnoreCase(student.getStudentname()))
        {
            studb.setStudentname(student.getStudentname());
        }

        if(Objects.nonNull(student.getStudentmajor()) && !"".equalsIgnoreCase(student.getStudentmajor()))
        {
            studb.setStudentmajor(student.getStudentmajor());
        }

        return studentRepository.save(studb);
    }


}
