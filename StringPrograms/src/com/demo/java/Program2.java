package com.demo.java;

import java.util.stream.IntStream;

//IntStream with skip ()
public class Program2 {

	public static void main(String[] args) {
		
		IntStream
		.range(1, 10) // no 10
		.skip(8)     //skip first 8
		.forEach(x-> System.out.println(x));
		
		//solution = 9
	}
}
