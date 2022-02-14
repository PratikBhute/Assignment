package com.example.curd.curddemo.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
    @GetMapping("/web")
    private String greeting()
    {
        return "welcome";
    }
}
