package com.java8;

interface Calculator{
	
	int on(int i1, int i2);
}

public class CalculatorImpl {

	
	public static void main(String[] args) {

		Calculator calculator =  //implementation
		(int i1, int i2) -> {
			
			if(i1<i2) {
				throw new RuntimeException("message");
			}else {
				return i2-i1;
			}
		};

		System.out.println( calculator.on(20,40));
	}

}
