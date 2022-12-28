package com.crud.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.crud.entity.Product;

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
	
	public String uploadImage(String path, MultipartFile file) throws IOException;
	
	public InputStream getResource(String path, String fileName) throws FileNotFoundException;
}
