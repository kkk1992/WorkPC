package com.demo.java.stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class Program5 {

	public static void main(String[] args) {
		
		String names[]= {"AAA","AAB","AAC","BBB","BBC","CpC","CPC","CDE"};
		
		Stream.of(names).filter(x->x.startsWith("A"))
		.sorted()
		.forEach(System.out::println);
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        
		Arrays
		.stream(names)
		.filter(x->x.startsWith("C"))
		.sorted()
		.forEach(System.out::println);
		
	
		
	}
}
