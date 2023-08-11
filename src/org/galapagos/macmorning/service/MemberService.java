package org.galapagos.macmorning.service;

import org.galapagos.macmorning.cli.Input;
import org.galapagos.macmorning.dao.MemberDao;
import org.galapagos.macmorning.exception.UseridCountOverException;
import org.galapagos.macmorning.vo.Member;

public class MemberService {
	MemberDao dao = new MemberDao();
	
	public void signUp() throws UseridCountOverException {
		Member member = inputMem();
		//리스트에 추가하기
		dao.add(member);
	}
	
	public Member inputMem() throws UseridCountOverException {
		
		String userid = inputUserid();
		
		String pw = Input.read("비밀번호 >> ");
		String name = Input.read("이름 >> ");
		String email = Input.read("email >> ");

		// Member instance 생성
		Member member = new Member(userid, pw, name, email);
		
		return member;
	}


	public String inputUserid() throws UseridCountOverException {
		String userid = "";
//		while(true) {
//			userid = Input.read("사용자 id >> ");
//			//id중복체크
//			Member m = dao.findByUserId(userid);
//			if(m != null) {
//				System.out.println("중복된 아이디입니다");
//			}else{
//				break;
//			}
//		}
//		return userid;
		
		for(int i =0; i < 3 ; i++) {
			userid = Input.read("사용자 id >> ");
			//id중복체크
			Member m = dao.findByUserId(userid);
			if(m != null) {
				System.out.println("중복된 아이디입니다");
			}else{
				return userid;
			}
		}
		// id할당 성공 or 3번 중복으로 회원가입 실패
		throw new UseridCountOverException();
	}

}