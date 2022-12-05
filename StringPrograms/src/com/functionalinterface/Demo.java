package com.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		
		Predicate<Integer> p= y->y>10;
		
		BiPredicate<Integer, Integer> b = (r,q)->p.equals(r);
		
		BiPredicate<Integer, Integer> c=
		(age, salary)-> {if(age>18 && salary<1000) return true; 
		return false;};
		
		
		try {
			System.out.println(p.test(50));
			
			System.out.println(b.test(50, 100));
			
			System.out.println("c "+c.test(21, 5000));
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	}
}
