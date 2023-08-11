package org.galapagos.macmorning.dao;


import java.util.List;

import org.galapagos.macmorning.vo.Member;

public class MemberDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testRead();
		testAdd();
		testFindByUserId();
		testUpdate();
	}
	
	
	static void testRead() {
		MemberDao dao = new MemberDao();
		
		List<Member> list = dao.getMemberList();
		for(Member m : list) {
			System.out.println(m);
		}
	}
	
	static void testAdd() {
		MemberDao dao = new MemberDao();
		
		List<Member> list = dao.getMemberList();
		Member m2 = new Member("dooli", "1234", "둘리", "dooli@naver.com");
		dao.add(m2);
//		if(list.size() != 5) {
//			System.err.println("추가실패");
//		}
		
		//단정문 vr매개변수로 -ea
		assert list.size() != 5 : "추가실패";
	}
	
	static void testFindByUserId() {
		MemberDao dao = new MemberDao();
		
		String userid = "hong";
		Member m = dao.findByUserId(userid);
		
		assert  m != null && userid.equals(m.getUserid()) : userid + "검색실패";
		
		userid = "kang";
		m = dao.findByUserId(userid);
		
		assert m == null : userid + "검색실패";
	}
	
	static void testUpdate() {
		MemberDao dao = new MemberDao();
		Member m = new Member("na","1234","나길동","na@naver.com");
		Member m2 = dao.update(m);
		assert m2 != null & m == m2 : "업데이트 실패";
		
		m = dao.findByUserId("hong");
		m.setEmail("hong@daum.net");
		m2 = dao.update(m);
		assert m2 != null & m == m2 : "업데이트 실패";
		
	}
	
	static void testDelete() {
		MemberDao dao = new MemberDao();
		Member m = dao.delete("na");
		
		assert m != null & m.getUserid().equals("na") : "삭제실패";
		
	}
}

