package com.example.curdoprationonetomanyrelationship.rest_Controller;

import com.example.curdoprationonetomanyrelationship.Entity.Department;
import com.example.curdoprationonetomanyrelationship.Service.DepertmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class DepermentRestController
{

    @Autowired(required = true)
    private DepertmentService depertmentServiceImpl;

    @GetMapping("/depertment")
    public List<Department> findAllDeperment(){
        return depertmentServiceImpl.listAllDepartments();

    }
    @PostMapping("/save")
        public Department storeDepartment(@RequestBody Department department){
        return depertmentServiceImpl.saveDepartment(department );
    }
    @PutMapping("/")
    public Department updateDepartment(@RequestBody Department department) {
        return depertmentServiceImpl.saveDepartment(department);
    }

    @DeleteMapping
    public String deletingDepartment(@RequestBody Department department) {
       depertmentServiceImpl.deleteDepartment(department);
        return "Deleted"+ department;
    }
}
