package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YourController
{
	@GetMapping("/web")
	public String greeting() 
	{
		return "This is my first Spring Project";
			
	}

}
