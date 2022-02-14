package com.example.demo.myContorller;

import com.example.demo.reporesatory.UserDetailsReporasatory;
import com.example.demo.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserDetailsRestController {

    @Autowired
    private UserDetailsReporasatory userDetailsReporasatory;

    @GetMapping("/all")   // http://localhost:8080/user/all
    public List<UserDetails> getAllUser() {
        return (List<UserDetails>) userDetailsReporasatory.findAll();
    }

    @PostMapping("/save") // http://localhost:8080/user/save
    public UserDetails saveUser(@RequestBody UserDetails details) {
        return userDetailsReporasatory.save(details);
    }

    @PutMapping("/update") // http://localhost:8080/user/update
    public UserDetails updateUser(@RequestBody UserDetails details) {
        return userDetailsReporasatory.save(details);
    }

    @DeleteMapping("/delete") // http://localhost:8080/user/update
    public String deleteUser(@RequestBody UserDetails details) {
        userDetailsReporasatory.delete(details);
        return "Deleted Successfully"+details;
    }
}
