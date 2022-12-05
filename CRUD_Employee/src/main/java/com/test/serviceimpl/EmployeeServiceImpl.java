package com.test.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Employee;
import com.test.exceptions.ResourceNotFoundException;
import com.test.repositories.EmployeeRepo;
import com.test.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
		
		
	return employeeRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "Id", id));
	
	}

	@Override
	public List<Employee> getAllEmployees() {
	List<Employee> list = employeeRepo.findAll();
	
	return list;
	}

	@Override
	public void deleteEmployee(long id) {
		
		Optional<Employee> employee = employeeRepo.findById(id);
		
		employeeRepo.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
	
		Employee existingEmployee = employeeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
		
		
		existingEmployee.setName(employee.getName());	
		existingEmployee.setCity(employee.getCity());
		existingEmployee.setSalary(employee.getSalary());
		
		employeeRepo.save(existingEmployee);
		
		return existingEmployee;
		
	
		
	}

}
 