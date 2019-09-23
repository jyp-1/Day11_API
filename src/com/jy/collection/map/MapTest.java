package com.jy.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MapTest {

	public static void main(String[] args) {
		//map 
		//Key : String
		//value : Object
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("f1", 1);
		map.put("k1", 2);
		map.put("s1", 1);
		System.out.println(map.get("f1"));
		System.out.println(map.get("k1"));
		System.out.println(map.get("s1"));
		
		map.put("f1", 200); //수정
		System.out.println(map.get("f1"));
		
		
		//빈복문
		//1. key
		// Iterator (반복자) - 또 다른 Collection의 한종류
		Iterator<String> it=map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(map.get(key));
		}

	}

}
