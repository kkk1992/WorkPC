package com.feign.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feignDemo", url="http://localhost:8084/user")
                                 // 1ST MICROSERVICE'S URL COMMON PART
public interface FeignService {

	@GetMapping("/name")
	public String getName();
}
