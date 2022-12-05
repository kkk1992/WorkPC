package com.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GraderTest {

	@Test
	void GraderTest() {
		Grader grader = new Grader();
		
		assertEquals('F', grader.determineLetterGrade(59));
		
		
	}

}
