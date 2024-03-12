package com.example.DevopsIntegrationApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DevopsIntegrationApplication {

	@GetMapping
	public String getmessage() {
		return ("welcome to akshay devopspipeline");
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
