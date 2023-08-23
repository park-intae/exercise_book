package java_study.chap_08.sec_09;

public abstract class Animal {
	public String kind; // 추상 클래스
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상 메서드
}
