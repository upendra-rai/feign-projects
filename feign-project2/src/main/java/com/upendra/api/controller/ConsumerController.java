package com.upendra.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upendra.api.feign.api.User1FeignController;

@RestController
@RequestMapping("/feignService")
public class ConsumerController {

	@Autowired
	private User1FeignController user1FeignController;

	@GetMapping("/f1-name")
	public String getName() {
		return user1FeignController.getName();
	}

	@GetMapping("/f1-address")
	public String getAddress() {
		return user1FeignController.getAddress();
	}

}
