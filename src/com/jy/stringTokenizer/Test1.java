package com.jy.stringTokenizer;


import java.util.*; //java.utill 안에 있는 모든 클래스 



public class Test1 {

	public static void main(String[] args) {
		//파싱
		String str = "iu,27,suji,24,choa,30,hani,25";
		
		StringTokenizer st =new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {     //boolean 타입의 조건식
			String s = st.nextToken();//문자열을 파싱(자르는 메서드)
			String age = st.nextToken();
			System.out.println(s);
			System.out.println(age);
		}
	
	
		

	}

}
