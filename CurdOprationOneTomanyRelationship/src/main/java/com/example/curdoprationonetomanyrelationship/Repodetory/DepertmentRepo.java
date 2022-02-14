package com.example.curdoprationonetomanyrelationship.Repodetory;

import com.example.curdoprationonetomanyrelationship.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepertmentRepo extends JpaRepository<Department,Long>
{

}
