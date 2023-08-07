package java_study.chap_05;

import java.util.Scanner;

public class ArrayExample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner data = new Scanner(System.in);
		int[] inpVal = new int[5];

		for (int i = 0; i <= inpVal.length - 1; i++) {
			System.out.print("정수 >>");
			inpVal[i] = data.nextInt();
		}

		for (int a : inpVal) {
			System.out.print(a + "");
		}
		System.out.println();

		int sum = 0;
		for (int x : inpVal) {
			sum += x;
		}
		System.out.println("전체합계: " + sum);
		double aver = (double) sum / inpVal.length;
		System.out.println("전체평균:" + aver);
	}

}
