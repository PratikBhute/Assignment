package com.example.htmldesigndemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController
{
    @GetMapping("/")
    private String path(){
        return "myHtml";
    }
}
