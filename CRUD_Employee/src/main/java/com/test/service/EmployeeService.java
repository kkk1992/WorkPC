package com.test.service;

import java.util.List;
import java.util.Optional;

import com.test.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(long id);
	
	public List<Employee> getAllEmployees();
	
	public void deleteEmployee(long id);
	
	public Employee updateEmployee(Employee employee, long id);
	
}
