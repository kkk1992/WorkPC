package com.pack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@FunctionalInterface
public interface Two extends One {

	void m1();
}

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		
		
		List<Employee> list1= Arrays.asList();
	Employee e1=	new Employee(1, "1234");
	Employee e2=	new Employee(2, "12345");
	Employee e3=	new Employee(3, "12545");
		
	list1.add(e1);
	list1.add(e2);
	list1.add(e3);
	
	List<Employee> list2=Arrays.asList(new Employee(1, "1"), new Employee(2, "2"));
	
	List<String> listOfNames = list1.stream().map(e->e.getName()).filter(x->x.startsWith("1")).collect(Collectors.toList());
		
	}

}
