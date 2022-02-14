package com.example.examplespring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController   // point to handle incoming request from the web
//@Controller
public class MyController {
    @GetMapping("/")   // specifying URL to connect
    @RequestMapping(
            name = "/hello",    // actual name of URL
            consumes = "aplication/json",
            method = RequestMethod.GET,
            value = "/hello1",           // alias name for URL
            produces = "plain/text")
    public Employee getEmployee() {
        return new Employee();

    }
}