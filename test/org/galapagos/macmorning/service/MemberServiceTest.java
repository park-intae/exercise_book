package org.galapagos.macmorning.service;

import org.galapagos.macmorning.exception.UseridCountOverException;
import org.galapagos.macmorning.vo.Member;

public class MemberServiceTest {

	public static void main(String[] args) throws UseridCountOverException {
		// TODO Auto-generated method stub
		testInputMember();
	}

	static void testInputMember() {
		MemberService service = new MemberService();
​
		Member m;
		try {
			m = service.inputMember();
			System.out.println(m);
​
		} catch (UserIdCountOverException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
