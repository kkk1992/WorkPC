package com.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Sorting {

	public static void main(String[] args) {
		
		List<Integer> al = Arrays.asList(1,2,3,4,5);
		
		for (Integer integer : al) {
			
			System.out.println(integer);
		}
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Inside iterator");
			int a= itr.next();
			
		}
		List<String> al2= Arrays.asList("A","B");
		
		for (String name : al2) {
			
			System.out.println(name);
		}
		
		Set<Integer> hs = new HashSet();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator Itr = hs.iterator();
		
		while(Itr.hasNext()) {
			System.out.println("Inside HashSet");
			System.out.println(Itr.next());
		}
	}
}
