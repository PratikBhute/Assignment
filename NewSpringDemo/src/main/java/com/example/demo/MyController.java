package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	@Autowired
	private MyService myService;
	
	
	@GetMapping("/")
	public String Greeting() {
		return "this is my first project";
		
	}
	@GetMapping("/serv")
	public String HelloPratik() {
		return myService.MyFile();
		
	}

}
