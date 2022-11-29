package com.test.service;

import java.util.List;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.model.Product;

@FeignClient(value="feignDemo", url="http://localhost:8080/product")
public interface FeignServiceUtil {

		//get single product
		@GetMapping("/get/{id}")
		Product getProduct(long id);
		
		//get all products
		@GetMapping("/getall")
		List<Product> getAllProductList();
		
		//save product
		@PostMapping("/save")
		Product saveProduct(Product product);
		
		//update product
		@PutMapping("/update/{id}")
		Product updateProduct(Product product,@PathVariable long id);
		
		//delete product
		@DeleteMapping("/delete/{id}")
		void deleteProduct (long id);
	
	
}
