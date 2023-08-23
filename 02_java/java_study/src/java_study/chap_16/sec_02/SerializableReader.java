package java_study.chap_16.sec_02;

public class SerializableReader {

	public static void main(String[] args) {
		try {
			ClassA v = (ClassA) load("C:/Temp/Object.dat");

			System.out.println("field1: " + v.field1);
			System.out.println("field2.field1: " + v.field2.field1);

			System.out.println("field3: " + v.field3);
			System.out.println("field4: " + v.field4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public static Object load(String filePath) throws Exception {
//		// 호출한 쪽에서 예외처리
//		// close만 자동화
//		try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis);) {
//			return ois.readObject();
//		}
//	}

}
