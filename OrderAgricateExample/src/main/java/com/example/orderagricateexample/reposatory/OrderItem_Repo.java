package com.example.orderagricateexample.reposatory;

import com.example.orderagricateexample.modul.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItem_Repo extends JpaRepository<OrderItem,Long> {
}
