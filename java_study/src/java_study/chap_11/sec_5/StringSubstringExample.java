package java_study.chap_11.sec_5;

public class StringSubstringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567 ";
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		//문제, 파일의 확장자명를 추출하시오
		String file = "Hellow,World.mp3";
		int ix = file.lastIndexOf(".");
		if (ix != -1) {
			String exposer = file.substring(ix + 1);
			System.out.println(exposer);
		}
		//문제2, 확장자를 제외한 파일명을 추출하시오
		int ix2 = file.indexOf(".");
		if(ix2 != -1) {
			String fileName = file.substring(0, ix2);
			System.out.println(fileName);
		}
	}

}
