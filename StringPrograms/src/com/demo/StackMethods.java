package com.demo;

import java.util.Stack;

public class StackMethods {

	//First In Last Out
	
	public static void main(String[] args) {
		
		Stack<Object> stack = new Stack<>();
		
		stack.push("A");
		
		stack.push("B");
		
		stack.push("C");
		
		System.out.println(stack.search("X")); //output = -1
		
		System.out.println(stack.search("A")); //output =3
		
		System.out.println(stack.search("B")); //output =2
		
		System.out.println(stack.search("C")); //output =1
	}
}
