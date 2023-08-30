package org.galapagos.macmorning.vo;

import org.galapagos.macmorning.vo.*;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member();
		System.out.println(m1);
		
		Member m2 = new Member("hong", "1234", "홍길동", "hong@naver.com");
		System.out.print(m2);
		System.out.print(m2.getUserid());
		System.out.print(m2.getName());
		System.out.print(m2.getPassword());
		System.out.print(m2.getEmail());
	}

}
