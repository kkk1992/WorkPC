package com.demo;

import java.util.function.Predicate;

public class Reverse {
	
	static String name= "I live in Pune";
	static String reverse="";
	
	public static String reverseMethod(String line) {
		
		for(int i=name.length()-1;i>0;i--) {
			reverse= reverse + name.charAt(i);
		}
		
		Predicate<String> checkLength=str->str.length()>5;
		System.out.println(checkLength.test("abcdef"));
		return reverse;
	}
	
	public static void main(String[] args) {
		
		//reverseMethod(name);
		
		System.out.println(reverseMethod(name));
	}
}
