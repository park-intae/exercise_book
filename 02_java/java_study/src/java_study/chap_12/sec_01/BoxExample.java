package java_study.chap_12.sec_01;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str1 = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(158);
		Integer value = box2.get();
	}

}
