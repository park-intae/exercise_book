package java_study.chap_14.sec_01;
import java.util.*;
public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.print("총객체수 : " + size);
		
		Iterator<String> iterator = set.iterator();
				while(iterator.hasNext()) {
				String element = iterator.next();
				System.out.println("\t" + element);
				}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		for(String element : set) {
			System.out.println("\t" + element);
			}

		set.clear();
		
		if(set.isEmpty()) { System.out.println("비어 있음"); }

	}

}
