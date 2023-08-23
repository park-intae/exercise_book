package java_study.chap_04;

import java.util.Scanner;

public class for_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i; // sum = sum + 1;
			}
		}

		System.out.println("1~100까지 짝수만 더하면?" + sum);

		// 초기화

		sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}

		System.out.println("1~100까지 짝수만 더하면?" + sum);

		// 입력값까지 더하기

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오");
		int num = sc.nextInt();

		sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i; // sum = sum + 1;
		}

		System.out.println("입력값까지 더하면?" + sum);

	}

}
