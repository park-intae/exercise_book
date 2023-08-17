package org.galapagos.macmorning.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.galapagos.macmorning.vo.Member;

public class MemberMapDao implements MemberDao{
	private Map<String, Member> memberMap;
	
	public void MemberMapDao() {
		memberMap = new HashMap<String,Member>();
		memberMap.put("hong", new Member("hong","1234","홍길동","hong@naver.com"));
		memberMap.put("gong", new Member("gong","1234","공길동","Gong@naver.com"));
		memberMap.put("jang", new Member("jang","1234","장길동","jang@naver.com"));
		memberMap.put("kim", new Member("kim","1234","김길동","kim@naver.com"));
		
		
	}

	@Override
	public void add(Member m) {
		memberMap.put(m.getUserid(), m);
		
	}

	@Override
	public Member findByUserId(String userId) {
		return memberMap.get(userId);
	}

	@Override
	public Member update(Member m) {
		return memberMap.put(m.getUserid(), m);
	}

	@Override
	public Member delete(String userid) {
		return memberMap.remove(userid);
	}

	@Override
	public List<Member> getMemberList() {
		return new ArrayList<>(memberMap.values());
	}

	@Override
	public List<Member> SearchByName(String name) {
		List<Member> list = new ArrayList();
		
		for (Member m : memberMap.values()) {
			if(m.getName().contains(name)){
				list.add(m);
			}
		}
		return list;
	}


}
