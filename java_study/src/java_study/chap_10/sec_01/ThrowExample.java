package java_study.chap_10.sec_01;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//후속작업

		
	}
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lnag.String2");
	}
}
