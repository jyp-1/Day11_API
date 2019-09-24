package com.jy.calendar;

import java.util.Calendar;

public class CalendarTest3 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		//택배..
		//현재의 년월일 
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		System.out.println("현재의 년월일");
		System.out.println(year+" 년");
		System.out.println(month+" 월");
		System.out.println(date+" 일");
		
		//이틀뒤의 년원일 
		//calendar.set(calendar.DATE, date+10);
		//calendar.roll(Calendar.DATE, 10);  //roll은 해당 필드만 돌리기 때문에 +30일을 해도 월이 바뀌지 않고 일수만 바뀐다.
		calendar.add(Calendar.DATE, 10);	//add 는 다 돌린다.
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		date = calendar.get(Calendar.DATE);
		System.out.println("이틀뒤 년월일");
		System.out.println(year+" 년");
		System.out.println(month+" 월");
		System.out.println(date+" 일");
		
	}

}
