package com.upendra.api.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user1-project1", url = "${project1-api.feign.url}")
public interface User1FeignController {

	@GetMapping("/name")
	public String getName();

	@GetMapping("/address")
	public String getAddress();

}