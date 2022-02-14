package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController
{
	@GetMapping("/webService")
	public String greeting() 
	{
		return "This is my first Web Project";
			
	}

}
