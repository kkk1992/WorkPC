package com.simple;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SortingHash {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Amar");
		hm.put(2, "Beyonce");
		hm.put(3, "Chand");
		
		//System.out.println(hm);
		
		
		Set<Integer> set = hm.keySet();
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Inside Iterator");
			int a= itr.next();
			
			System.out.println("Value "+hm.get(a));
			System.out.println();
		}
		
		hm.forEach((k,v)->System.out.println(k+" Key " +v+" value"));
		
		
	}
}
