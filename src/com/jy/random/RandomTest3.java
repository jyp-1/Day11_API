package com.jy.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest3 {
	
	public static void main(String[] args) {
		

		Random random= new Random();
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("불고기");
		ar.add("라면");
		ar.add("햄버거");
		ar.add("돈까스");
		ar.add("굶기");
		ar.add("떡볶이");
		
		
		
		int b =random.nextInt(ar.size()
				); //0~5미만의 숫자
		
		System.out.println(ar.get(b));
		
		
		
		
	
		
	}

}
