package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
	
	@RequestMapping("/")
	public String hello() {
		return "This is SpringBoot Hello World!!!";
	}

}
