package com.demo.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program9 {

	public static void main(String[] args) throws IOException {
		//Print lines containing "a"
		
		Stream<String> words= Files.lines(Paths.get("C:\\Users\\user\\Desktop\\note.txt"));
		
		words
		.filter(x->x.contains("a"))
		.collect(Collectors.toList())
		.forEach(x->System.out.println(x));
			
		words.close();
	}
}
