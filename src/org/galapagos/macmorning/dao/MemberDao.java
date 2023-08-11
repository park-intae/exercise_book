package org.galapagos.macmorning.dao;

import java.util.ArrayList;
import java.util.List;
import org.galapagos.macmorning.vo.*;

public class MemberDao {
	public MemberDao() {
		memberList = new ArrayList<Member>();
		memberList.add(new Member("hong","1234","홍길동","hong@naver.com"));
		memberList.add(new Member("gong","1234","공길동","Gong@naver.com"));
		memberList.add(new Member("jang","1234","장길동","jang@naver.com"));
		memberList.add(new Member("kim","1234","김길동","kim@naver.com"));
	}
	
	private int indexOf(String userid) {
		for(int i = 0; i < memberList.size(); i++) {
			if(userid.equals(memberList.get(i).getUserid())) {
				return i;
			}
		}
		return -1;
		

	}
	
	// 추가
	public void add(Member m) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(m);
	}
	
	// 검색
	public Member findByUserId(String userId) {
//		for(Member m : memberList) {
//			if(userId.equals(m.getUserid())) {
//				return m;				
//			}
//		}
//		return null;
		
		int ix = indexOf(userId);
		
		return ix != -1 ? memberList.get(ix) : null;
	}
	
	// 수정
	public Member update(Member m) {
//		for(int i = 0; i < memberList.size(); i++) {
//			if(m.getUserid().equals(memberList.get(i).getUserid())) {
//				memberList.set(i, m);
//				return m;
//			}
//		}
//		
//		return null;
		int ix = indexOf(m.getUserid());
		if(ix != -1) {
			memberList.set(ix, m);
			return m;
		}
		return null;
		
		
	}
	
	// 삭제
	public Member delete(String userid) {
		int ix = indexOf(userid);
		
		if(ix != -1) {
			return memberList.remove(ix);
		}
		return null;
		
		// return ix != -1 ? memberList.remove(ix) : null;
	}
	
	
	
	
	
	public List<Member> getMemberList() {
		return memberList;
	}

	public MemberDao(List<Member> memberList) {
		super();
		this.memberList = memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}

	private List <Member> memberList;

	
}
