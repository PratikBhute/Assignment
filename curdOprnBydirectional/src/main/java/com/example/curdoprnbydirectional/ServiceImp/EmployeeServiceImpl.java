package com.example.curdoprnbydirectional.ServiceImp;

import com.example.curdoprnbydirectional.Rrpository.EmployeeRepository;
import com.example.curdoprnbydirectional.Service.EmployeeService;
import com.example.curdoprnbydirectional.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Student saveEmployee(Student student) {
        // TODO Auto-generated method stub
        return employeeRepository.save(student);
    }

    @Override
    public List<Student> listEmployee() {
        // TODO Auto-generated method stub
        return employeeRepository.findAll();
    }

    @Override
    public Student updateEmployee(Student student) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String deleteEmployee(Student student) {
        // TODO Auto-generated method stub
        return null;
    }

}