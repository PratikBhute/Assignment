package com.example.orderagricateexample.serviceImpli;

import com.example.orderagricateexample.modul.Costumar;
import com.example.orderagricateexample.reposatory.Costumar_Repo;
import com.example.orderagricateexample.service.Costumer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Costumer_Impl implements Costumer_Service
{
    @Autowired
    private Costumar_Repo costumar_repo;

    @Override
    public List<Costumar> listAllCostumer()
    {
        return costumar_repo.findAll();
    }

    @Override
    public Costumar saveCostumer(Costumar costumar) {
        return costumar_repo.save(costumar);
    }

    @Override
    public Costumar updateCostumer(Costumar costumar) {
        return costumar_repo.save(costumar);
    }

    @Override
    public String deleteCostumer(Costumar costumar) {
         costumar_repo.delete(costumar);
         return "Deleted Costumar Sucessfully";
    }
}
