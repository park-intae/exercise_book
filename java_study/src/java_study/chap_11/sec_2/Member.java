package java_study.chap_11.sec_2;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String pw;
	public int age;
	public boolean adult;
	
	public Member (String id, String name, String pw, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}
	
}
