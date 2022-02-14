package com.example.orderagricateexample.reposatory;

import com.example.orderagricateexample.modul.Costumar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Costumar_Repo extends JpaRepository<Costumar,Long>
{

}
