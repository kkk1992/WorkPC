package com.functional;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
				//should be generic
		Predicate<Integer> p =y-> y>10;
		
		System.out.println(p.test(50));
		
		//true
	}
}
