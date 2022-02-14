package com.example.demo.reporesatory;

import com.example.demo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressReporesatory extends JpaRepository<Address, Long>
{

}
