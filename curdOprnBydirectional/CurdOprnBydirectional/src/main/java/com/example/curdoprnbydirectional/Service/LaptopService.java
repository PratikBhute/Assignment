package com.example.curdoprnbydirectional.Service;
import java.util.List;

import com.example.curdoprnbydirectional.model.Laptop;

public interface LaptopService {
    public Laptop saveLaptop(Laptop laptop);

    public List<Laptop> listLaptop();

    Laptop updateLaptop(Laptop laptop);

    String deleteLaptop(Laptop laptop);
}