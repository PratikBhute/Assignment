package com.example.orderagricateexample.serviceImpli;

import com.example.orderagricateexample.modul.Order;
import com.example.orderagricateexample.reposatory.Order_Repo;
import com.example.orderagricateexample.service.Order_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Order_Impl implements Order_Service
{


    @Autowired
    private Order_Repo order_repo;

    @Override
    public List<Order> listAllOrders() {
        return order_repo.findAll();
    }

    @Override
    public Order saveOrder(Order order) {
        return order_repo.save(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return order_repo.save(order);
    }

    @Override
    public String deleteOrder(Order order) {
        order_repo.delete(order);
        return "Order Deleted Sussfully";
    }
}
