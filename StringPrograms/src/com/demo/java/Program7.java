package com.demo.java;

import java.util.Arrays;
import java.util.List;

//Stream from list, filter and print
public class Program7 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("A","B","C","D");
		
		names
		.stream()
		.map(String::toLowerCase)
		.filter(x->x.startsWith("a"))
		.forEach(System.out::println);
		
	}
}
