package com.example.orderagricateexample.controller;

import com.example.orderagricateexample.modul.Costumar;
import com.example.orderagricateexample.service.Costumer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class Costumer_Controller
{
    @Autowired(required = true)
    private Costumer_Service costumer_service;

    @GetMapping("/costumer")
    private List<Costumar> costumerList(){
        return costumer_service.listAllCostumer();
    }

    @PostMapping("/save")
    private Costumar saveCostumer(@RequestBody Costumar costumar){
        return costumer_service.saveCostumer(costumar);
    }
    @PutMapping("/update")
    private  Costumar updateCostumer(@RequestBody Costumar costumar){
        return costumer_service.updateCostumer(costumar);
    }
    @DeleteMapping("/delete")
    private String deleteCostumer(@RequestBody Costumar costumar){
        return costumer_service.deleteCostumer(costumar);
    }

}
