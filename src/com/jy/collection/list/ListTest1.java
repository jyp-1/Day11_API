package com.jy.collection.list;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		// 1,2,3
		ArrayList ar = new ArrayList();

		ar.add(1);
		ar.add('c');
		ar.add(3);
		ar.add("four");
		
		ar.add(1,"two");
		ar.set(1, 10000);
		
		ar.remove(1);
		//ar.clear();
		
		int num = 10;
		Integer n = num; //auto Boxing
		ar.add(num); 
		num = (int)ar.get(0);
		
		

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

}
