package com.functionalinterface;
@FunctionalInterface
interface A{
	void read();
}
public class Lambda {

	public static void main(String[] args) {
		
		A a= ()-> {System.out.println("a");
		};
		}

}
