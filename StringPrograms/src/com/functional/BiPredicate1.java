package com.functional;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiPredicate;

import lombok.Getter;
@Getter
public class BiPredicate1 {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bi= (p,q)->p.equals(q);
		
		System.out.println(bi.test(1, 1));//true
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<String, Integer>();
		
		chm.put("One", 1);
		chm.put("Two", 2);
		
		Set<String> set = chm.keySet();
		
		Iterator<String> itr= set.iterator();
		
		while(itr.hasNext()) {
			String a = itr.next();
			System.out.println("key:"+a+" "+"value:"+chm.get(a));
			
			
		}
		chm.forEach((k,v)->System.out.println(k+" "+v));
		
	
	}
}
