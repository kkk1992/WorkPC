package com.demo;

public enum Enum_DaysOfTheWeek {

	MONDAY(01),TUEDAY(02),WEDNESDAY(03),THURSDAY(04),
	FRIDAY(05),SATURDAY(06),SUNDAY(07);
	
	final int number;
	
	private Enum_DaysOfTheWeek(int number) {
		this.number=number;
	}
}

