package com.crud.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.exceptions.ProductNotFoundException;
import com.crud.model.Product;
import com.crud.repository.ProductRepo;
import com.crud.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	//get single product
	@Override
	public Product getProduct(long id) {

		return productRepo.findById(id).orElseThrow(()-> new ProductNotFoundException("Product", "Id", id));
		
	}

	//get all products
	@Override
	public List<Product> getAllProductList() {
		List<Product> list = new ArrayList<>();
		
		list= productRepo.findAll();
		
		return list;
	}
	
	//save product
	@Override
	public Product saveProduct(Product product) {
	
		return productRepo.save(product);
	}

	//delete product
	@Override
	public void deleteProduct(long id) {
		
		productRepo.findById(id).orElseThrow(()->new ProductNotFoundException("Product", "Id", id));
		
		productRepo.deleteById(id);
	}

	//update product
	@Override
	public Product updateProduct(Product newProduct, long id) {
	
		Product oldProduct= productRepo.findById(id).orElseThrow(()->new ProductNotFoundException("Product", "Id", id));
		
		oldProduct.setProductName(newProduct.getProductName());
		oldProduct.setPrice(newProduct.getPrice());
		
		productRepo.save(oldProduct);
		
		return oldProduct;
		
	}



}
