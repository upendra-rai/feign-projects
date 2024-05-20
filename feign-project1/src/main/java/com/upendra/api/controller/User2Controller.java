package com.upendra.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upendra.api.feign.api.User2FeignController;

@RestController
@RequestMapping("/user-project1")
public class User2Controller {

	@Autowired
	private User2FeignController feignController;

	@GetMapping("/f2-contact")
	public String getContact() {
		return feignController.getContact();
	}

	@GetMapping("/f2-status")
	public String getStatus() {
		return feignController.getStatus();
	}
}