package java_study.chap_11.sec_1;

public class Member {
	public String id;
	public int age;
	
	public Member(String id, int age) {
		this.id =  id;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {		// 매게값이 Member 타입?
			Member member = (Member) obj; // 타입변환
			if(id.equals(member.id) && age == member.age) { 	// id 동일?
				return true;
			}
		}
		
		return false;
	}
	
}
