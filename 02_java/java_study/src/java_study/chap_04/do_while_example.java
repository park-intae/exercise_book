package java_study.chap_04;

import java.util.Scanner;

public class do_while_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지를 입력하시오.");
		System.out.println("프로그램을 종료하려면 q를 누르시오.");

		Scanner sc = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = sc.nextLine(); // 입력한 문자열 얻기
			System.out.println(inputString);
		} while (!inputString.equalsIgnoreCase("q")); // 문자열 비교

		System.out.print("");
		System.out.print("프로그램 종료");
	}

}
