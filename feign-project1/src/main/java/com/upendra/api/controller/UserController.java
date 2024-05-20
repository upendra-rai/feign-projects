package com.upendra.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/name")
	public String getName() {
		return "Upendra Rai";
	}

	@GetMapping("/address")
	public String getAddress() {
		return "Bangalore";
	}

	@GetMapping("/status")
	public String getStatus() {
		return "Active";
	}
}