package com.jy.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest4 {
	
	public static void main(String[] args) {
		//닭다리 쿠션40%, 최신핸드폰 10%, 은갈치 넥타이 50%
		
		Random random = new Random();
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("닭다리 쿠션");
		ar.add("닭다리 쿠션");
		ar.add("닭다리 쿠션");
		ar.add("닭다리 쿠션");
		ar.add("최신 핸드폰");
		ar.add("은갈치 넥타이");
		ar.add("은갈치 넥타이");
		ar.add("은갈치 넥타이");
		ar.add("은갈치 넥타이");
		ar.add("은갈치 넥타이");
		
		
		
		
		int b = random.nextInt(ar.size());
		System.out.println(ar.get(b));
		
		
		
		
		
		
		
		
		
	}

}
