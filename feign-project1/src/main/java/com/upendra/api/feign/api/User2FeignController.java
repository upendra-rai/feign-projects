package com.upendra.api.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user-project2", url = "${project2-api.feign.url}")
public interface User2FeignController {

	@GetMapping("/contact")
	public String getContact();

	@GetMapping("/status")
	public String getStatus();

}
