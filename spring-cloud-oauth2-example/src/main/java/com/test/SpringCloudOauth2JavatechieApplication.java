package com.test;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringCloudOauth2JavatechieApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2JavatechieApplication.class, args);
	}

	@GetMapping("/")
	public String messsage (Principal principal) { 
		// javax.security.auth.Subject;
		return "Hi "+principal.getName()+"Welcome to SpringCloudOauth2";
		
	}
}
