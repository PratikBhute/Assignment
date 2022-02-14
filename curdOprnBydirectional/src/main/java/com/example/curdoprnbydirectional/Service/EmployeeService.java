package com.example.curdoprnbydirectional.Service;


import com.example.curdoprnbydirectional.model.Student;

import java.util.List;


public interface EmployeeService {
    public Student saveEmployee(Student student);

    public List<Student> listEmployee();

    public Student updateEmployee(Student student);

    public String deleteEmployee(Student student);
}