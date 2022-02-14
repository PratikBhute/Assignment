package com.example.demo.myContorller;

import com.example.demo.reporesatory.AddressReporesatory;
import com.example.demo.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressRestController {
    @Autowired
    private AddressReporesatory addressReporesatory;

    @GetMapping("/all")   // http://localhost:8080/address/all
    public List<Address> getAllUser() {
        return addressReporesatory.findAll();
    }

    @PostMapping("/save") // http://localhost:8080/address/save
    public Address saveUser(@RequestBody Address details) {
        return addressReporesatory.save(details);
    }

    @PutMapping("/update") // http://localhost:8080/address/update
    public Address updateUser(@RequestBody Address details) {
        return addressReporesatory.save(details);
    }

    @DeleteMapping("/delete") // http://localhost:8080/address/update
    public String deleteUser(@RequestBody Address details) {
        addressReporesatory.delete(details);
        return "Deleted Successfully"+details;
    }
}