package com.example.orderagricateexample.reposatory;

import com.example.orderagricateexample.modul.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Order_Repo extends JpaRepository<Order,Long>
{

}
