package com.example.crudoperationnew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

// abstraction of hibernate
@Service
public interface PersonRepository extends JpaRepository<Person, Long>{

}