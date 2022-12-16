package com.java8;

public interface ABC {

	void m1();
	
public static void main(String[] args) {
		
		ABC abc= null;
		
		abc.m1();
		
		
	}
}

class Test implements ABC{
	
	public void m1() {
		System.out.println("Inside class");
	}
	
	
	
	
}
