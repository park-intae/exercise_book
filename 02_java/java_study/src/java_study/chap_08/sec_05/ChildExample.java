package java_study.chap_08.sec_05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child; //자동 타입 변환
		parent.method1();
		parent.method2(); // child의 method2 참조
//		parent.method3(); // parent에서 파악 불가능
		
		child.method1(); // Parent에 super()
		child.method2();
		child.method3();
	}

}
