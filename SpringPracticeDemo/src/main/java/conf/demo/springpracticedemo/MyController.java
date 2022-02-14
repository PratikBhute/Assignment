package conf.demo.springpracticedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
    @GetMapping("/")
    public String greeting(){
        return "Welcome to my webapp";
    }
}