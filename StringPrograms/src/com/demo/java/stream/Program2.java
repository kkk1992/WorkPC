package com.demo.java.stream;

import java.util.stream.IntStream;

//IntStream with skip ()
public class Program2 {

	public static void main(String[] args) {
		
		IntStream
		.range(1, 10) // no 10
		.skip(8)     //skip first 5
		.forEach(x-> System.out.println(x));
		
		//solution = 6,7,8,9  (Not 10 , the last)
	}
}
