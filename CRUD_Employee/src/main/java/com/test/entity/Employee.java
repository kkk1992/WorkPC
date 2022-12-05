package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="employees")

public class Employee {

	private long id;
	
	@NotNull
	@Size(max=20, message="Name should be upto 20 characters")
	private String name;
	
	@NotNull
	@Size(max=20, message = "City should be upto 20 characters")
	private String city;
	
	@NotNull
	@Digits(fraction=2, integer=10, message = "Enter digits only")
	private float salary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(long id, @NotNull @Size(max = 20, message = "Name should be upto 20 characters") String name,
			@NotNull @Size(max = 20, message = "City should be upto 20 characters") String city,
			@NotNull @Digits(fraction = 2, integer = 10, message = "Enter digits only") float salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public Employee() {
		super();
	}
	
	
}
