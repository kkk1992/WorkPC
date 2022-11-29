package com.demo;

public class Debug {

	
	public static void main(String[] args) {
		
		for(int i=1;i<6;i++) {
			
			System.out.println(i);
		}
		
		String name= "Karan";
		
		try {
			String name2= name.substring(7);
			
			System.out.println(name2);
		} catch (StringIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("End");
	}
}
