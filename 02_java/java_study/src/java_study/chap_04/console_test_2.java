package java_study.chap_04;

import java.util.Scanner;

public class console_test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요일입력: 주중 1) 주말 2) 공휴일 3)");

		int data = sc.nextInt();
		if (data == 1) {
			System.out.println("열공");
		} else if (data == 2) {
			System.out.println("복습");
		} else {
			System.out.println("휴식");
		}
	}

}