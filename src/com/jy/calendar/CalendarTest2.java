package com.jy.calendar;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		calendar.set(Calendar.YEAR, 2020);
		year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		int d = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(d);
		
		//2020 11월 24일 화요일
		
		
		calendar.set(Calendar.MONTH, 10);
		int month= calendar.get(Calendar.MONTH);
		
		d = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(d);
		
		

	}

}
