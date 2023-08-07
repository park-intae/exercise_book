package java_study.chap_04;

import java.util.Scanner;

public class colsole_test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하시오>>");
		String name = sc.next();

		System.out.println("소속을 입력하시오>>");
		String company = sc.next();

		System.out.println("나이를 입력하시오>>");
		int age = sc.nextInt();

		System.out.println("당신의 이름은 " + name + " 입니다");
		System.out.println("당신의 소속은 " + company + " 입니다");
		System.out.println("당신의 나이는 " + age + " 입니다");
	}

}
