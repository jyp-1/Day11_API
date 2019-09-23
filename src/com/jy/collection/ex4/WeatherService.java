package com.jy.collection.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	private StringBuffer sb;
	private Scanner sc;

	public WeatherService() {
		sc = new Scanner(System.in);
		sb = new StringBuffer();
		sb.append("seoul-17.2-60-흐림-");
		sb.append("Daejon-29.9-20-맑음-");
		sb.append("jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불"); // 파싱(Tokenizer)
		// System.out.println(sb);// toString
	}

	// 메서드명 inti
	// 날씨정보를 파싱해서 저장. -> ArrayList 에 저장

	public HashMap<String, Weather> inti() {

		// HashMap에 추가
		// Key 는 도시명 Value 는 weather
		// 리턴은 HashMap

		StringTokenizer st = new StringTokenizer(sb.toString(), "-");
		HashMap<String, Weather> hm = new HashMap<String, Weather>();

		while (st.hasMoreTokens()) {
			Weather weather = new Weather();
			weather.setCity(st.nextToken()); // seoul
			weather.setGion(Double.parseDouble(st.nextToken())); // 17.2
			weather.setHumidity(Integer.parseInt(st.nextToken())); // 60
			weather.setStatus(st.nextToken()); // 흐림

			hm.put(weather.getCity(), weather);

		}
		return hm;

	}

	public Weather findWeather(HashMap<String, Weather> hm) {
		// 도시명을 입력받아서 해당 Weather 검색
		// weather 를 리턴
		System.out.println("도시명 입력");
		String city = sc.next();

		Weather weather = hm.get(city);

		return weather;
	}

	public Weather deleteWeather(HashMap<String, Weather> hm) {
		// 도시명을 입력 받아서 해당정보(weather)를 삭제
		System.out.println("삭제할 도시명 입력");
		String city = sc.next();

		Weather weather = hm.remove(city);
		
		return weather;
	}

}
