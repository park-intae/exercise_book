package org.galapagos.macmorning.service;


import org.galapagos.macmorning.dao.MemberMapDao;
import org.galapagos.macmorning.exception.UseridCountOverException;
import org.galapagos.macmorning.vo.Member;

public class MemberServiceTest {

	public static void main(String[] args) throws UseridCountOverException {
//		testInputMember();
//		testLogIn();
		testSearchByName();
	}

	static void testInputMember() {
		MemberService service = new MemberService(new MemberMapDao());
		
		
		Member m = service.inputMem();
		
		System.out.print(m);
		
		
	}
	
	static void testLogIn() {
		MemberService service = new MemberService(new MemberMapDao());
		Member m = service.login();
		
		System.out.println(m);
		
		if(m != null) {
			System.out.println(m.getUserid() + "님 환영합니다");
		}else {
			System.out.println("아이디나 비밀번호가 잘못되었습니다");
		}
	}
	
	static void testSearchByName() {
		MemberService service = new MemberService(new MemberListDao());
		service.searchByName();
		
		
	}
}
