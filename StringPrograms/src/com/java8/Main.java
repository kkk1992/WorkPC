package com.java8;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
	
	public static void main(String[] args) {
		
		//Creating hashmap of even numbers
		HashMap<String, Integer> evenNumbers= new HashMap<>();
		
		evenNumbers.put("One", 1);
		evenNumbers.put("Two", 2);
		
		ConcurrentHashMap<String, Integer> concurrent = new ConcurrentHashMap<>(evenNumbers);
		concurrent.put("Three", 3);
		System.out.println(evenNumbers+" "+ concurrent);
		
	
	}
	
	
}
