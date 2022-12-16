package com.demo.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

//Stream from list, filter and print
public class Program7 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("A","B","C","D");
		
		System.out.println(UUID.randomUUID().toString());
		
		names
		.stream()
		.map(String::toLowerCase)    // map(x->x.toLowerCase()
		.filter(x->x.startsWith("a"))
		.forEach(System.out::println);  // method reference
		
	}
}
