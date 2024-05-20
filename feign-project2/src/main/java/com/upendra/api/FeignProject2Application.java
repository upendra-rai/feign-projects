package com.upendra.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignProject2Application.class, args);
	}

}
