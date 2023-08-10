package java_study.chap_11.sec_5;

import java.util.Scanner;

public class StringWithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="abc"; 
			boolean b1=s.startsWith("ab"); 
			boolean b2=s.startsWith("a");
			boolean b3=s.startsWith("bc"); 
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(b3);

		// 문제, 파일명 입력 받아서 
			Scanner sc = new Scanner(System.in);
			
			System.out.println("파일명? >>");
			String filename = sc.nextLine();
			
			String test = filename.toLowerCase(); //혹시 있을 충돌 방지를 위해
			
			if(test.endsWith(".mp3")) {
				System.out.println("음악파일입니다");
			}else {
				System.out.println("음악파일이 아닙니다");
			}
			
			sc.close();
	}

}
