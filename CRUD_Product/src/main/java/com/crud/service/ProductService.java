package com.crud.service;

import java.util.ArrayList;
import java.util.List;

import com.crud.model.Product;

public interface ProductService {

	//get single product
	Product getProduct(long id);
	
	//get all products
	List<Product> getAllProductList();
	
	//save product
	Product saveProduct(Product product);
	
	//delete product
	void deleteProduct (long id);
	
	//update product
	Product updateProduct(Product product, long id);
	
}
