package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

	
	
}
