package com.comparable;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee emp) {
		if(salary==this.salary)
		return 0;
		
		else if(salary>emp.salary)
			return 1;
		
		else
			return -1;
	}
	
	
}
