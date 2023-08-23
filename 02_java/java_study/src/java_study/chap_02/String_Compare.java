package java_study.chap_02;

public class String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("안녕하세요");
		String str2 = new String("안녕하세요");

		System.out.println(str1);
		System.out.println(str2);

		if (str1 == str2) {
			System.out.println("두 문자열 일치");
		} else {
			System.out.println("두 문자열 불일치");
		}

		// ==(비교연산) : js는 내용 검사
		// java는 참조값 검사
		// 내용의 동등성 판단을 위해서는 .equals() 메서드 사용

		if (str1.equals(str2)) {
			System.out.println("두 문자열 일치");
		} else {
			System.out.println("두 문자열 불일치");
		}
	}
}
