package java_study.chap_11.sec_6;

import java.util.Arrays;

public class ArraySortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score = {99, 98, 97};
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		int index = Arrays.binarySearch(score, 99);
		System.out.println("인덱스 위치: " + index);
		
		String [] name = {"홍길동", "박동수", "김민수"};
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		int index2 = Arrays.binarySearch(name, "박동수");
		System.out.println("인덱스 위치: " + index2);
		
		Member[] member = {new Member("홍길동"),new Member("박동수"),new Member("김민수")};
		Arrays.sort(member);
		System.out.println(Arrays.toString(member));
		int index3 = Arrays.binarySearch(member, new Member("홍길동"));
		System.out.println("인덱스 위치: " + index3);
	}

}
