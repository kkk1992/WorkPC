package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparator {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student("Z", 30));
		al.add(new Student("B", 20));
		al.add(new Student("C",31));
		
		Collections.sort(al, new AgeComparator());
		
		System.out.println(al);
		
	}
}
