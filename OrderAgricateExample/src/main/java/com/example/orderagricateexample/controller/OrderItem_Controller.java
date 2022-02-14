package com.example.orderagricateexample.controller;

import com.example.orderagricateexample.modul.OrderItem;
import com.example.orderagricateexample.service.OrderItem_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class OrderItem_Controller {
    @Autowired(required = true)
    private OrderItem_Service orderItem_service;

    @GetMapping("/item")
    private List<OrderItem> orderItems(){
        return orderItem_service.listAllOrderItems();
    }

    @PostMapping("/save")
    private OrderItem saveOrderItem(@RequestBody OrderItem orderItem){
        return orderItem_service.saveOrderItem(orderItem);
    }
    @PutMapping("/update")
    private OrderItem updateOrderItem(@RequestBody OrderItem orderItem){
        return orderItem_service.updateOrderItem(orderItem);
    }
    @DeleteMapping("/delete")
    private String deleteOrderItem(@RequestBody OrderItem orderItem){
        orderItem_service.deleteOrderItem(orderItem);
        return "DeleteOrderItem";
    }
}
