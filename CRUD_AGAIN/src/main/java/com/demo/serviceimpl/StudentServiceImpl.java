package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.exceptions.ResourceNotFoundException;
import com.demo.repository.StudentRepo;
import com.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student getStudentById(long id) {
		
		return studentRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Id not found"));
	}

	@Override
	public List<Student> getListOfStudents() {
		List<Student> list = studentRepo.findAll();
		
		return list;
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
		
	}

	@Override
	public Student updateStudent(long id, Student newStudent) {
		
	Student existingStudent=studentRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Id not found"));
	
	existingStudent.setAge(newStudent.getAge());
	existingStudent.setName(newStudent.getName());
	
	studentRepo.save(existingStudent);
	
		return existingStudent;
	}

	@Override
	public void deleteStudent(long id) {
		
		Student student= studentRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id not found"));
		
		studentRepo.deleteById(id);
		
	}
	
	public Student findStudents(String keyword) {
		return studentRepo.findStudents(keyword);
		
	}

	@Override
	public Student findstudents(String keyword) {
		
		return studentRepo.findStudents(keyword);
	}
	
}
