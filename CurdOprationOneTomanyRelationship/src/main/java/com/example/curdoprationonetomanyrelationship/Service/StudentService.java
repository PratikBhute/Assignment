package com.example.curdoprationonetomanyrelationship.Service;

import com.example.curdoprationonetomanyrelationship.Entity.Student;

import java.util.List;

public interface StudentService
{
    public Student saveStudent(Student student);
    public List<Student> listAllStudents();

    List<Student> listStudents();

    List<Student> lisAlltStudents();

    public Student updaateStudent(Student student);
    public  Student deleteStudent(Student student);
}

