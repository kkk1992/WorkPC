package com.demo.java;

import java.util.Arrays;

public class Program5 {

	public static void main(String[] args) {
		
		String names[]= {"AAA","AAB","AAC","BBB","BBC","CpC","CPC","CDE"};
		
		Arrays
		.stream(names)
		.filter(x->x.startsWith("C"))
		.sorted()
		.forEach(System.out::println);
		
	}
}
