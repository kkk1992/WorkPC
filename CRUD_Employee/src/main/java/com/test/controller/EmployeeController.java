package com.test.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Employee;
import com.test.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
		
		return new ResponseEntity<Employee> (employeeService.getEmployeeById(id), HttpStatus.OK);
		
	}
	@PostMapping("/getall")
	public List<Employee> getAllEmployees(){
		List<Employee> list = employeeService.getAllEmployees();
		
		return list;
	}
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee){
		
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> updateEmployee(@Valid @RequestBody Employee employee, @PathVariable long id){
		
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable long employeeId){
		
		employeeService.deleteEmployee(employeeId) ;
		
		return new ResponseEntity<>("Product Deleted Successfully", HttpStatus.OK);
	}
}
