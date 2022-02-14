package com.example.orderagricateexample.service;

import com.example.orderagricateexample.modul.Order;

import java.util.List;

public interface Order_Service
{
    public List<Order> listAllOrders();
    public Order saveOrder(Order order);
    public Order updateOrder(Order order);
    public String deleteOrder(Order order);

}
