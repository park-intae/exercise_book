package java_study.chap_12.sec_01;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box<String> box2 = Util.boxing("김창식"); // <String>boxing 이 맞는 표현인데 <String>이 추론에 의해 생략됨
		String StrValue = box2.get();
	}

}
