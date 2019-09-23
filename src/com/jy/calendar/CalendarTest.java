package com.jy.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// 현재 시간의 정보
		Calendar cal = Calendar.getInstance(); // new GregorianCalendar()
		// get
		int hour = cal.get(Calendar.HOUR); // 12시간 기준
		hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간 기준
		int min = cal.get(Calendar.MINUTE);

		// 연도
		int year = cal.get(Calendar.YEAR);
		// 월
		int mon = cal.get(Calendar.MONTH); // 1월 0, 2월 1, 3월 2, 4월 3, 5월 4 ....
		// 일
		int date = cal.get(Calendar.DATE);

		int d = cal.get(Calendar.DAY_OF_WEEK); // 요일 1-일요일, 2-월요일

		System.out.println(hour);
		System.out.println(min);
		System.out.println(year);
		System.out.println(mon + 1);
		System.out.println(date);
		System.out.println(d);

	}

}
