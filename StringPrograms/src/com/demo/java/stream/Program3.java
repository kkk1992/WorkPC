package com.demo.java.stream;

import java.util.stream.IntStream;

//_Integer_Stream_With_Sum
public class Program3 {

	
	public static void main(String[] args) {
		
			IntStream
			.range(1, 10)
			.sum();
	
	System.out.println(IntStream
								.range(1, 10)
								.sum());
	}
}
