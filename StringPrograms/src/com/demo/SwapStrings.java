package com.demo;

public class SwapStrings {

	public static void main(String[] args) {
		
		String s1="one"; 
		
		String s2="two";
		
		
		s1=s1+s2; //55555_666666
		
		System.out.println(s1);
		
		
		
		s2=s1.substring(0,s1.length()-s2.length());
		
		s1=s1.substring(s1.length()-s2.length()-1,s1.length());
		
		System.out.println("s1 ="+s1);
		
		System.out.println("s2 ="+s2);
		
	}
}
