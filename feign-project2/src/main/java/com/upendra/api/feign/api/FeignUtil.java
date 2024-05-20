package com.upendra.api.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user", url = "${project1-api.feign.url}")
public interface FeignUtil {

	@GetMapping("/name")
	public String getName();

	@GetMapping("/address")
	public String getAddress();

	@GetMapping("/status")
	public String getStatus();
}
