package com.functionalinterface;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Supplier  is available in java.util.function
// Does not take any input

public class SupplierExample {

	public static void main(String[] args) {
		
		Supplier<String> s = ()-> new String("hi");
		
		String d= s.get();
		
		System.out.println(d);
		
		
		Random r = new Random();
		
		Supplier<Integer> s1= r::nextInt;
		
		Integer p = s1.get();
		
		//System.out.println(p);
		//wrong Function<T, R> f = r::nextInt;
		
		Predicate<Integer> x= y-> y>10;
		
		System.out.println("x "+x.test(1));
	}
}
