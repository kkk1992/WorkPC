package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		System.out.println("new");
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj
				-> System.out.println(obj));
		
		Set<Integer>set = map.keySet();
		
		System.out.println("Map");
		map.forEach((k,v)->System.out.println("Key="+k+"Value="+v));
		System.out.println("--------");
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		
		List<String> list =Arrays.asList("A","B","C","D","E");
		
		for (String string : list) {
			
			System.out.println(string);
		}
		
		list.forEach(x->System.out.println(x));
		
	}
	
	
	
}
