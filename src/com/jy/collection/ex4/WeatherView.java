package com.jy.collection.ex4;

import java.util.HashMap;
import java.util.Iterator;

public class WeatherView {

	public void view(String str) {
		System.out.println(str);
	}

	// 메서드명 view
	// 날씨 하나 정보 출력

	public void view(Weather weather) {

		System.out.println("city : " + weather.getCity());
		System.out.println("Gion : " + weather.getGion());
		System.out.println("Hum  : " + weather.getHumidity());
		System.out.println("Status : " + weather.getStatus());
		System.out.println("");

	}

	// 메서드명 view
	// 날씨 전체정보 출력

	public void view(HashMap<String, Weather> hm) {
		// 1단계
		// 키들을 모을 Iterator 생성
		Iterator<String> it = hm.keySet().iterator();

		while (it.hasNext()) {
			String Key = it.next();
			Weather weather = (hm.get(Key));

			System.out.println("city : " + weather.getCity());
			System.out.println("Gion : " + weather.getGion());
			System.out.println("Hum  : " + weather.getHumidity());
			System.out.println("Status : " + weather.getStatus());
			System.out.println("");

		}

	}

}
