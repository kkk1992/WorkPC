package com.demo.java;

import java.util.Arrays;
//average of squares of an int array
public class Program6 {

	
	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,5};
		
		Arrays
			.stream(array)
			.map(x->x*x)       //filter = boolean
			.average()
			.ifPresent(System.out::println);
		
	}
}
