package com.example.curdoprnbydirectional.Rrpository;

import com.example.curdoprnbydirectional.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Student, Long>
{


}