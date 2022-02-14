package com.example.curdoprnbydirectional.ServiceImp;
import java.util.List;

import com.example.curdoprnbydirectional.model.Laptop;
import com.example.curdoprnbydirectional.Rrpository.LaptopRepository;
import com.example.curdoprnbydirectional.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopServiceImpl  implements LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    @Override
    public Laptop saveLaptop(Laptop laptop) {
        // TODO Auto-generated method stub
        return laptopRepository.save(laptop);
    }

    @Override
    public List<Laptop> listLaptop() {
        // TODO Auto-generated method stub
        return laptopRepository.findAll();
    }

    @Override
    public Laptop updateLaptop(Laptop laptop) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String deleteLaptop(Laptop laptop) {
        // TODO Auto-generated method stub
        return null;
    }

}