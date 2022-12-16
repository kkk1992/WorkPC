package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {
	
	public static void main(String[] args) {
	
		
	Consumer<Integer> consumer= (t)-> {System.out.println("Printing : "+t);};
		
		consumer.accept(10);
		
		List<Integer> list1= Arrays.asList(1,4,2,3,4,5);
		
	Consumer<Integer> consumer2=t->System.out.println("Consumer"+t);
	consumer2.accept(2);
	
	Supplier<String> supplier =()->"Hi Java";
	
		System.out.println(supplier.get());
		
		Integer findFirst = list1.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println("find first "+findFirst);
		long count = list1.stream().count();
		
		System.out.println("count "+count);
		
		
	}
	
}
