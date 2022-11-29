package com.demo.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

//Stream rows from text file, sort, filter, print
public class Program8 {
public static void main(String[] args) throws IOException {
	
	Stream<String> words= Files.lines(Paths.get("C:\\Users\\user\\Desktop\\tasks.txt"));
	
	words
		.sorted()
		.filter(x->x.length()>3)
		.forEach(System.out::println);
	
		words.close();
}
}
