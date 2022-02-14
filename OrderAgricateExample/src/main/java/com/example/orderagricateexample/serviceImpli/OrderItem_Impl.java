package com.example.orderagricateexample.serviceImpli;


import com.example.orderagricateexample.modul.OrderItem;
import com.example.orderagricateexample.reposatory.OrderItem_Repo;
import com.example.orderagricateexample.service.OrderItem_Service;
import com.example.orderagricateexample.service.Order_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderItem_Impl implements OrderItem_Service
{
    @Autowired
    private OrderItem_Repo orderItem_repo;

    @Override
    public List<OrderItem> listAllOrderItems() {
        return orderItem_repo.findAll();
    }

    @Override
    public OrderItem saveOrderItem(OrderItem orderItem) {
        return orderItem_repo.save(orderItem);
    }

    @Override
    public OrderItem updateOrderItem(OrderItem orderItem) {
        return orderItem_repo.save(orderItem);
    }

    @Override
    public String deleteOrderItem(OrderItem orderItem) {
        orderItem_repo.delete(orderItem);
        return "Delete OrderItem Successfully";
    }
}
