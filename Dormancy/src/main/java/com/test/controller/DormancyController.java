package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Product;
import com.test.service.FeignServiceUtil;

@RestController
@RequestMapping("/demo")
public class DormancyController {

	@Autowired
	private FeignServiceUtil feignServiceUtil;
	
	//get single product
		@GetMapping("/{id}")
		public ResponseEntity<Product> getProduct(@PathVariable(value="id") long id){
			return new ResponseEntity<Product>(feignServiceUtil.getProduct(id),HttpStatus.OK);
		}
		
		//get all products
		@GetMapping("/getall")
		public List<Product> getAllProducts(){
			List<Product> listProduct =feignServiceUtil.getAllProductList();
			
			return listProduct;
		}
		
		//save product
		@PostMapping("/save")
		public ResponseEntity<Product> saveProduct( @RequestBody Product product){
			
			return new ResponseEntity<Product>(feignServiceUtil.saveProduct(product),HttpStatus.CREATED);
		}
		
		//update product
		@PutMapping("/update/{id}")
			public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product){
				
				return new ResponseEntity<Product>(feignServiceUtil.updateProduct(product, id), HttpStatus.OK);
			}
		
		
		//delete product
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<String> deleteProduct(@PathVariable(value="id") long productId){
			
			feignServiceUtil.deleteProduct(productId);
			
			return new ResponseEntity<>("Product Deleted Successfully", HttpStatus.OK);
		}

}
