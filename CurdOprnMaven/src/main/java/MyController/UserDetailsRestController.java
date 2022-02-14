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

import EntityClass.UserDetails;
import ReposetoryClass.UserDetailsReporasatory;

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
