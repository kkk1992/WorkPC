package com.date.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		String s="12/03/2022";
		
		Date dates = new SimpleDateFormat("dd/MM/YYYY").parse(s);
		
		
		System.out.println(s);
		
		System.out.println(dates);
		
	}
}
