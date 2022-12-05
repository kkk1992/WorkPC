package com.product;

public class Product {

	void productCheck(int weight) {
		
		System.out.println("Inside Product weight check method");
		
		if(weight<100) {
			throw new ProductWeightException100kg("Lesser weight");
		}
	}
	
	public static void main(String[] args) {
		
		Product product = new Product();
		
		try {
			product.productCheck(12);
		} catch (Exception e) {
		
			//e.printStackTrace();
		}
		
		System.out.println("Exception Handled ");
		System.out.print("Line 2");
		System.out.println("After GIT 3rd line");
		System.out.println("Line 4"); 
	}
	
	
	
}
