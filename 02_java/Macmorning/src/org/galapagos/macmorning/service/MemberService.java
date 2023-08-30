package org.galapagos.macmorning.service;

import java.util.List;

import org.galapagos.macmorning.cli.Input;
import org.galapagos.macmorning.dao.MemberDao;
import org.galapagos.macmorning.dao.MemberMapDao;
import org.galapagos.macmorning.exception.UseridCountOverException;
import org.galapagos.macmorning.vo.Member;

public class MemberService {
	MemberDao dao = new MemberMapDao();
	

	public void signUp() throws UseridCountOverException {
		Member member = inputMem();
		//리스트에 추가하기
		dao.add(member);
	}
	
	public Member login() {
		System.out.println("[로그인창]");
		String userid = Input.read("ID >>");
		String password = Input.read("PW >>");
		
		//로그인 검사
		Member m = dao.findByUserId(userid);
		if (m != null) {	//ID확인
			if(password.equals(m.getPassword())){	//PW확인
				return m;
			}
		}
		return null;
		
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

	public void searchByName() {
		System.out.println("[이름으로 찾기]");
		String keword = Input.read("검색어 >>");
		
		List<Member> list = dao.SearchByName(keword);
		System.out.printf("검색결과 : %건\n", list.size());
		for(Member m : list) {
			System.out.print(m);
		}
	}
}