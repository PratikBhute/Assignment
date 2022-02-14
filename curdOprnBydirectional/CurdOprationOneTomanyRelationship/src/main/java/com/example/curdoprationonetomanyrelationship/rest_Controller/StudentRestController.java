package com.example.curdoprationonetomanyrelationship.rest_Controller;

import com.example.curdoprationonetomanyrelationship.Entity.Student;
import com.example.curdoprationonetomanyrelationship.ServiceImpl.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentRestController {

    @Autowired(required = false)
    private StudentImpl studentImpl;

    @GetMapping("/")
    public List<Student> findAllStudent(){
        return studentImpl.lisAlltStudents();
    }

    @PostMapping("/")
    public Student storeStudent(@RequestBody Student student) {
        return studentImpl.saveStudent(student);
    }

    @PutMapping("/")
    public Student updateStudent(@RequestBody Student student) {
        return studentImpl.saveStudent(student);
    }

    @DeleteMapping
    public String deletingStudent(@RequestBody Student student) {
        studentImpl.deleteStudent(student);
        return "Deleted"+ student;
    }
}