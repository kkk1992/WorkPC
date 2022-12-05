package com.demo;

public class MainClass {

	public static void main(String[] args) {
		
		//All values
		Enum_DaysOfTheWeek[] values = Enum_DaysOfTheWeek.values();
		
		for (Enum_DaysOfTheWeek daysOfTheWeek : values) {
			
			System.out.println(daysOfTheWeek);
		}
		Enum_DaysOfTheWeek day= Enum_DaysOfTheWeek.FRIDAY;
		
		System.out.println("Day Number=" +day.number);


		if(day==Enum_DaysOfTheWeek.FRIDAY) {
			System.out.println("Yeah its FRIDAY");
		}
	}
}
