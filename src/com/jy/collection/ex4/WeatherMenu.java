package com.jy.collection.ex4;

import java.util.HashMap;
import java.util.Scanner;

public class WeatherMenu {
	private WeatherService weatherService;
	private WeatherView weatherView;
	private Scanner sc;

	public WeatherMenu() {
		weatherService = new WeatherService();
		weatherView = new WeatherView();
		sc = new Scanner(System.in);
	}
	// 메서드명 start
	// 1. 날씨정보 초기화 - init 실행
	// 2. 날씨정보추가 - addWeather 실행
	// 3. 전체날씨정보 - view 실행
	// 4. 지역날씨검색 - findWeather, view
	// 5. 날씨 정보 삭제
	// 6. 프로그램종료

	public void start() {
		boolean check = true;
		int num = 0;
		while (check) {
			System.out.println("1. 날씨 정보 초기화 ");
			System.out.println("2. 날씨 정보 추가 ");
			System.out.println("3. 전체 날씨 정보");
			System.out.println("4. 지역 날씨 검색");
			System.out.println("5. 날씨 정보 삭제");
			System.out.println("6. 프로그램 종료");
			num = sc.nextInt();

			switch (num) {

			case 1:
				
				HashMap<String, Weather> hm = weatherService.inti();
				weatherView.view(hm);
				
				break;

			case 2:

				break;

			case 3:
				Weather weather = weatherService.findWeather(hm);
				weatherView.view(weather);

				break;

			case 4:
				weather = weatherService.findWeather(hm);
				if (weather != null) {
					weatherView.view(weather);
				} else {
					weatherView.view("해당 지역의 정보가 없습니다");
				}
				break;

			case 5:
				weather = weatherService.deleteWeather(hm);
				if (weather != null) {
					weatherView.view("삭제성공");
				} else {
					weatherView.view("삭제 실패");
				}

				break;

			case 6:

				break;
			}
		}

	}

}
