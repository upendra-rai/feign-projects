package com.upendra.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-project2")
public class User2Controller {

	@GetMapping("/contact")
	public String getContact() {
		return "Contact Details - Project2";
	}

	@GetMapping("/status")
	public String getStatus() {
		return "Active - Project2";
	}
}
