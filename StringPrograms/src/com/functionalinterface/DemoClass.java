package com.functionalinterface;

interface C{
	void read();
}
public class DemoClass{
	C ref = ()->System.out.println("Hello");
	
	public static void main(String[] args) {
		C ref = ()->System.out.println("2");
		ref.read();
		
	}
	
	void f() {
	ref.read();
	}
	
	static String hi() {
		return "Hi";
	}
	
	String hii() {
		return "hi";
	}
	
	
	
	
//volatile	boolean check;//false
//	
//	//thread 1= check=true
//	
//	thread 2=
//	
//	
	
}
