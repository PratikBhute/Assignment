package com.example.orderagricateexample.service;

import com.example.orderagricateexample.modul.OrderItem;

import java.util.List;

public interface OrderItem_Service
{
    public List<OrderItem> listAllOrderItems();
    public OrderItem saveOrderItem(OrderItem orderItem);
    public OrderItem updateOrderItem(OrderItem orderItem);
    public  String deleteOrderItem(OrderItem orderItem);
}
