package java_study.chap_13.sec_01;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
	
		System.out.println(list);
		
		int size = list.size();
		System.out.println("총 객체수= " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		//순회
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.print(i + ":" + str);
		}
		System.out.println();
		
		//요소 제거
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		//다시 순회
		for(int i=0; i<list.size(); i++) {
		String str = list.get(i);
		System.out.println(i + ":" + str);
		
			
		}
	}

}
