package com.sorting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

	@Test
	void SimpleCalculatorTest() {
	
		SimpleCalculator calculator= new SimpleCalculator();
		
		assertEquals(4, calculator.add(2, 2));
		
		assertTrue(calculator.add(2, 2)==4);
	}
	
	@Test
	void SimpleCalculatorTest2() {
	
		SimpleCalculator calculator= new SimpleCalculator();
		
		assertEquals(3, calculator.add(2, 2));
		
		assertTrue(calculator.add(2, 2)==4);
	}

}
