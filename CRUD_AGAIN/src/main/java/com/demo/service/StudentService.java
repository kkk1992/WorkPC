package com.demo.service;

import java.util.List;

import com.demo.entity.Student;

public interface StudentService {

	Student getStudentById(long id);
	
	List<Student> getListOfStudents();
	
	Student saveStudent (Student student);
	
	Student updateStudent(long id, Student student);
	
	void deleteStudent(long id);
	
	Student findstudents(String keyword);
}
 