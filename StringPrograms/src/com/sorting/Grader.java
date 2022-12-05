package com.sorting;

import java.util.concurrent.Callable;

public class Grader implements Callable<Grader> {

 char determineLetterGrade(int marks) {
	 if(marks<0)
		 throw new IllegalArgumentException();
	 
	 
	 if(marks<60) {
		 return 'F';
	 }
	
	 else {
		 return 0;
	 }
	
	 
 }

@Override
public Grader call() throws Exception {
	// TODO Auto-generated method stub
	return null;
}
}
