package com.example.curdoprationonetomanyrelationship.Service;

import com.example.curdoprationonetomanyrelationship.Entity.Department;

import java.util.List;

public interface DepertmentService
{
    public List<Department>listDepartments();
    public Department saveDepartment(Department department);
    public Department updaateDepartment(Department department);
    public  Department deleteDepartment(Department department);

    List<Department> listAllDepartments();
}
