package com.jy.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class StudentService {

	// 메서드명은 studentSearch
	// 학생의 이름을 입력 받아서 이름이 같은 학생을 리턴해주기
	private Scanner sc;

	public StudentService() {
		sc = new Scanner(System.in);
	}

	public Student studentSearch(ArrayList<Student> students) {

		System.out.println("학생검색");
		System.out.println("이름입력");
		String irum = sc.next();
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(irum)) {  //문자열이라서 equlas
				student = students.get(i);
				break;
			}
			
		}
		return student;

	}
	
	
	//studentDelete 
	//이름을 입력해서 해당 학생을 삭제
	
	// public void studentDlete(Array<Student>students, Student student){
	//students.remove(student);}
	
	public Student sudentDelete(ArrayList<Student>students) {
		System.out.println("삭제할 학생 이름 입력");
		String irum =sc.next();
		Student student1 =null;
		//String msg ="Delete Fail";
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getName().equals(irum)) {
				student1 = students.remove(i);
				//msg="Delete Fail";
				break;
			}
				
		}
			return student1;
	}
	
	
	

	// 메서드명은 studentInput --1
	// 학생의 정보 입력

	public void studentInput(ArrayList<Student> students) {

		Student student = new Student();
		System.out.println("===================================================");
		System.out.println("이름 입력");
		student.setName(sc.next());
		System.out.println("번호 입력");
		student.setNum(sc.nextInt());
		System.out.println("국어 성적 입력");
		student.setKor(sc.nextInt());
		System.out.println("수학 성적 입력");
		student.setMath(sc.nextInt());
		System.out.println("영어 성적 입력");
		student.setEng(sc.nextInt());
		System.out.println("===================================================");
		student.setSum(student.getKor() + student.getEng() + student.getMath());
		student.setAvg(student.getSum() / 3.0);
		students.add(student);

	}

}
