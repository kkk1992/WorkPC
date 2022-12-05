package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

	
}
