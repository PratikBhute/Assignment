package com.example.curdoprnbydirectional.Rest_Controller;

import java.util.List;
import com.example.curdoprnbydirectional.Service.EmployeeService;
import com.example.curdoprnbydirectional.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
    @Autowired(required = true)
    private EmployeeService employeeService;

    @GetMapping("/")
    public List<Student> findEmp() {
        return employeeService.listEmployee();
    }

    @PostMapping("/")
    public Student storeEmployee(@RequestBody Student student) {
        return employeeService.saveEmployee(student);
    }
}