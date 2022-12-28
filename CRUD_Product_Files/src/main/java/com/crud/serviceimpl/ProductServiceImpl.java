package com.crud.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.crud.entity.Product;
import com.crud.exceptions.ProductNotFoundException;
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

	//Upload Image
	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {

		// File name
		String name = file.getOriginalFilename();
		// abc.png

		// random name generate file
		String randomID = UUID.randomUUID().toString();
		String fileName1 = randomID.concat(name.substring(name.lastIndexOf(".")));

		// Full path
		String filePath = path + File.separator + fileName1;

		// create folder if not created
		File f = new File(path);
		if (!f.exists()) {
			f.mkdir();
		}

		// file copy

		Files.copy(file.getInputStream(), Paths.get(filePath));

		return fileName1;
	}

	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		String fullPath = path + File.separator + fileName;
		InputStream is = new FileInputStream(fullPath);
		// db logic to return inpustream
		return is;
	}


}
