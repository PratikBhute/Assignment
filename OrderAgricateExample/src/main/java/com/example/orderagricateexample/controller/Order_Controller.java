package com.example.orderagricateexample.controller;

import com.example.orderagricateexample.modul.Order;
import com.example.orderagricateexample.service.Order_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class Order_Controller
{
    @Autowired(required = true)
    private Order_Service order_service;

    @GetMapping("/order")
    private List<Order> orderList(){
        return order_service.listAllOrders();
    }
    @PostMapping("/save")
    private Order saveOrder(@RequestBody Order order){
        return order_service.saveOrder(order);
    }
    @PutMapping("/update")
    private Order updateOrder(@RequestBody Order order) {
        return order_service.updateOrder(order);
    }
    @DeleteMapping("/delete")
    private String deleteOrder(@RequestBody Order order){
        order_service.deleteOrder(order);
        return "OrderDelete";
    }
}
