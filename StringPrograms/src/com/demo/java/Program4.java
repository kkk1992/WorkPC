package com.demo.java;

import java.util.Optional;
import java.util.stream.Stream;

//Stream.of
public class Program4 {


	public static void main(String[] args) {
		
		
		Stream.of("A","B","C")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
	}
}
