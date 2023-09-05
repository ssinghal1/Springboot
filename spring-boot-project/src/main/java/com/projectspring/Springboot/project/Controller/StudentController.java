package com.projectspring.Springboot.project.Controller;

import com.projectspring.Springboot.project.entity.Student;
import com.projectspring.Springboot.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){

       return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> fetchstudent(){

        return studentService.fetchstudent();
    }

    @GetMapping("/students/{id}")

    public Student getStudentById(@PathVariable("id") long studentid){

        return studentService.getstudentbyid(studentid);
    }


    @DeleteMapping("/students/{id}")
    public String deletestudentbyid(@PathVariable("id") long studentid){

        studentService.deletestudentbyid(studentid);
        return "Student deleted successfully !!";
    }

    @PutMapping("/students/{id}")
    public Student updateStudentRecord (@PathVariable("id") Long studentid, @RequestBody Student student){

       return studentService.updateStudentRecord(studentid,student);
    }

}
