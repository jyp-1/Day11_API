package com.jy.stringTokenizer.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberMaker {

	private String memberInfo;

	public MemberMaker() {
		this.memberInfo = "iu-iu-27-choa-choa-28-suji-suji-30";
	}

	public void makeMember() {
		// memberInfo의 내용을 파싱해서
		// member 객체를 생성해서
		// 모든 정보를 출력

		/**
		 * split 사용시
		 * 
		 * String [] info =memberInfo.split("-") for(int i=0;i<info.length;i++){ Member
		 * member = new Member(); member.setId(info[i]); member.setname(info[++i]); }
		 */

		StringTokenizer st = new StringTokenizer(this.memberInfo, "-");
		Member[] members = new Member[3];
		ArrayList<Member> ar = new ArrayList<Member>();
		
		while (st.hasMoreTokens()) {
			Member member = new Member();
			member.setId(st.nextToken());
			member.setName(st.nextToken());
			member.setAge(Integer.parseInt(st.nextToken()));
			ar.add(member);
		}

		for (int i = 0; i < ar.size(); i++) {
			System.out.println("Id : " + ar.get(i).getId());
			System.out.println("Name : " + ar.get(i).getName());
			System.out.println("Age : " + ar.get(i).getAge());

		}

	}
}
