package com.jy.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	private ArrayList<Student> students;
	private StudentService ss;
	private StudentView sv;

	public StudentMenu() {
		students = new ArrayList<Student>();
		ss = new StudentService();
		sv = new StudentView();
	}

	public void start() {

		// 1. 학생정보를 등록
		// 2. 학생의 전체 정보를 출력
		// 3. 학생의 정보를 조회 - 이름으로 검색
		// 4. 학생정보를 삭제
		// 5. 프로그램 종료

		Scanner sc = new Scanner(System.in);

		boolean check = true;
		while (check) {
			System.out.println("1. 학생정보등록");
			System.out.println("2. 학생전체정보");
			System.out.println("3. 학생정보조회");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 프로그램종료");
			System.out.println("");
			int n = sc.nextInt();

			switch (n) {

			case 1:

				ss.studentInput(students);

				break;

			case 2:

				sv.view(students);
				break;

			case 3:
				Student student = ss.studentSearch(students);
				sv.view(student);

				break;
			case 4:
				Student student1 = ss.sudentDelete(students);
				System.out.println("학생 삭제");
				break;

			default:
				System.out.println("프로그램 종료");
				check = false;

			}

		}
	}
}
