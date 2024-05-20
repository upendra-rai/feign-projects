package com.upendra.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upendra.api.feign.api.FeignUtil;

@RestController
@RequestMapping("/feignService")
public class ConsumerController {

	@Autowired
	private FeignUtil feignUtil;

	@GetMapping("/f-name")
	public String getName() {
		return feignUtil.getName();
	}

	@GetMapping("/f-address")
	public String getAddress() {
		return feignUtil.getAddress();
	}

	@GetMapping("/f-status")
	public String getStatus() {
		return feignUtil.getStatus();
	}

}
