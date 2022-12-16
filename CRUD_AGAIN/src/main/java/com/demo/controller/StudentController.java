package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;
import com.demo.repository.StudentRepo;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	//get single
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getSingleStudent(@PathVariable long id){
		return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
	}
	
	//get all
	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getAllStudents(){
		
		return new ResponseEntity<List<Student>> (studentService.getListOfStudents(), HttpStatus.OK);
	}
	
	//post
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		return new ResponseEntity<Student>(studentService.saveStudent(student),HttpStatus.CREATED);
		
	}
	
	//update single
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable long id,@RequestBody Student student){
		
		return new ResponseEntity<Student>(studentService.updateStudent(id, student), HttpStatus.OK);
	}
	
	//delete mapping
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable long id){
		
		studentService.deleteStudent(id);
		return new ResponseEntity<String>("Student deleted successfully",HttpStatus.OK);
	}
	
	@GetMapping("/find/{keyword}")
	public ResponseEntity<Student> findStudents(@PathVariable String keyword){
		
		return new ResponseEntity<Student>(studentService.findstudents(keyword), HttpStatus.OK);
	}
}
