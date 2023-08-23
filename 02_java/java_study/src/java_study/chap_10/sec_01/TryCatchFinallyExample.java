package java_study.chap_10.sec_01;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println(clazz);
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		System.out.println("프로그램 종료!!");
	}
}
