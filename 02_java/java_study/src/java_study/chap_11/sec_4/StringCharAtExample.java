package java_study.chap_11.sec_4;

public class StringCharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "010624-1230123";
		char gender = ssn.charAt(7);
		switch (gender) {
		case '1':
		case '3':
			System.out.print("남자입니다");
			break;
		case '2':
		case '4':
			System.out.print("여자입니다");
			break;
		}
	}

}
