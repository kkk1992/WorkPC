package com.demo;

public class Parent {

	int parentA=5;
	
	String parentName="Karan";
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		
		System.out.println();
	}
	
	 class Child{
		
		 int b=10;
		
		public String hello() {
			
			System.out.println(parentA);
			return parentName;
			
			
		}
	}
}

