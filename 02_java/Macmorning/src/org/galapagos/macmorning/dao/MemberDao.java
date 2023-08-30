package org.galapagos.macmorning.dao;

import java.util.List;

import org.galapagos.macmorning.vo.Member;

public interface MemberDao {

	// 추가
	void add(Member m);

	// 검색
	Member findByUserId(String userId);

	// 수정
	Member update(Member m);

	// 삭제
	Member delete(String userid);

	List<Member> getMemberList();
	
	List<Member> SearchByName(String name);
	
	void save()throws Exception;

	void load()throws Exception;
}