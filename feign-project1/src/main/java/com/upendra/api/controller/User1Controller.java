package com.upendra.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-project1")
public class User1Controller {
	
	@GetMapping("/name")
	public String getName() {
		return "Upendra Rai - Project1";
	}

	@GetMapping("/address")
	public String getAddress() {
		return "Bangalore - Project1";
	}

}