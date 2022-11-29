package com.demo.java;

import java.util.stream.IntStream;

//_Integer_Stream_With_Sum
public class Program3 {

	
	public static void main(String[] args) {
		
	int a=	IntStream
		.range(1, 10)
		.sum();
	
	System.out.println(a);
	}
}
