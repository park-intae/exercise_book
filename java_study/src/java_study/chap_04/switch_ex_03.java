package java_study.chap_04;

import java.util.Scanner;

public class switch_ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("메뉴입력: 짜장면, 우동, 라면 >>");
		String food = sc.next();

		switch (food) {
		case "짜장면":
			System.out.println("중국집 ㄱㄱ");
			break;
		case "우동":
			System.out.println("일식집 ㄱㄱ");
			break;
		case "라면":
			System.out.println("분식집 ㄱㄱ");
			break;
		default:
			System.out.println("집에서 먹어");
		}
	}

}
