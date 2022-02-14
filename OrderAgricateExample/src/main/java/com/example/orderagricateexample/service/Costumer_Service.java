package com.example.orderagricateexample.service;

import com.example.orderagricateexample.modul.Costumar;

import java.security.PublicKey;
import java.util.List;

public interface Costumer_Service
{
    public List<Costumar> listAllCostumer();
    public Costumar saveCostumer(Costumar costumar);
    public Costumar updateCostumer(Costumar costumar);
    public String deleteCostumer(Costumar costumar);
}
