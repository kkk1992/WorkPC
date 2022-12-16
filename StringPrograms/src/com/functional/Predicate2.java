package com.functional;

import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {
		
		Predicate<String> p=y->y.contains("hello");
		
		System.out.println(p.test("String"));
		
	}
}
