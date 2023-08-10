package java_study.chap_11.sec_5;

public class StringtoLowerUpperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));

		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
