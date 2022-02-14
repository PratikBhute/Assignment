package MyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import EntityClass.Address;
import ReposetoryClass.AddressReporesatory;

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