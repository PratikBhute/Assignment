package com.example.curdoprationonetomanyrelationship.Repodetory;

import com.example.curdoprationonetomanyrelationship.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>
{

}
