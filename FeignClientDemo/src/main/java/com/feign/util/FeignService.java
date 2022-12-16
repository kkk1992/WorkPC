package com.feign.util;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
//port 8086

@FeignClient(value="feignDemo", 
            url="http://localhost:8084/user")
            // 1ST MICROSERVICE'S URL COMMON PART

public interface FeignService {
//abstract method
	//with Mapping
	
	@GetMapping("/name")
	public String getName();
	
	@GetMapping("/address")
	public String getAddress();
	
	@GetMapping("/status")
	public String getStatus();
}
