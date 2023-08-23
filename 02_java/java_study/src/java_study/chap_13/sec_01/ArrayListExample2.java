package java_study.chap_13.sec_01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> initList = Arrays.asList("홍길동", "신용권","김자바"); // 읽기전용
		
		// list1.add("김상식"); //크기변화(add,remove etc)는 불가능하지만 set으로 element교체는 가능
		
		List <String> list1 = new ArrayList(initList); // 다시 array화 시켜서 데이터 추가삭제 가능
		
		for (String name : list1) {
			System.out.println(name);
		}
		
		List <Integer> list2 = Arrays.asList(1, 2,3);
		for (int value : list2) {
			System.out.println(value);
		}
		
	}
}

