package com.functionalinterface;

public interface B {
void f1();
static void f3() {  //call by class/interface name .dot  f3()
	
}
default void f2() {
	System.out.println("f2");
}
}

@FunctionalInterface
interface Abc{
	void F2();
}

class D{
	void hi() {
	B ref= ()->{System.out.println("Hello");
	};
	B.f3();
	//every child class of interface and abstract class 
	//must override their abstract methods
	
	//lambda provides body to the abstract methods of functional interface
}
	
}