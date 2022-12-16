package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

	
	@Query("Select s from Student s where concat(s.id,s.name,s.age) LIKE %?1%")
	public Student findStudents(String keyword);
	
	
}
