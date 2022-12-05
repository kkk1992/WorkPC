package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController

public class OAuth2WithJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2WithJwtApplication.class, args);
	}

	@GetMapping(value="/products")
	public String getProductName() {
		return "Honey";
		
	}
}
