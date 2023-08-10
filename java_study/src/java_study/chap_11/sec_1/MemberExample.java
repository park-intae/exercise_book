package java_study.chap_11.sec_1;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue", 10);
		Member obj2 = new Member("blue", 10);
		Member obj3 = new Member("red", 20);
		Member obj5 = new Member("blue", 20);
		
		String obj4 = new String("blue");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동일합니다");
		}else {
			System.out.println("obj1과 obj2는 동일하지 않습니다");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동일합니다");
		}else {
			System.out.println("obj1과 obj3는 동일하지 않습니다");
		}
		
		if (obj1.equals(obj4)) {
			System.out.println("obj1과 obj4는 동일합니다");
		}else {
			System.out.println("obj1과 obj4는 동일하지 않습니다");
		}
	}
}
