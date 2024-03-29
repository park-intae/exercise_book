package java_study.chap_05;

import java.util.Scanner;

public class Array7 {

	static void getNumbers(String inputTitle, int[] data) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= data.length - 1; i++) {
			System.out.print(inputTitle);
			data[i] = sc.nextInt();
		}
	}

	static void showNumbers(int[] data) {
		for (int a : data) {
			System.out.print(a + "");
		}
		System.out.println();
	}

	static int addAll(int[] data) {
		int sum = 0;
		for (int x : data) {
			sum += x;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inpVal = new int[5];

		ArrayUtil.getNumbers("정수 >>", inpVal);
		ArrayUtil.showNumbers(inpVal);
		int sum = ArrayUtil.addAll(inpVal);

		System.out.println("전체합계: " + sum);
		double aver = (double) sum / inpVal.length;
		System.out.println("전체평균:" + aver);
	}

}