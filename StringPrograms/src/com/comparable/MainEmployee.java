package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee("A", 12, 20000));
		al.add(new Employee("Z", 21, 29000));
		al.add(new Employee("C", 13, 25000));
		
		Collections.sort(al);
		
		for (Employee employee : al) {
			
			System.out.println(employee.getName()+" "+employee.getAge()+" "+employee.getSalary());
		}
	}
}
