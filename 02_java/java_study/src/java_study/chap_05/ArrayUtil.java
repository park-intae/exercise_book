package java_study.chap_05;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

	static void getNumbers(String inputTitle, int[] data) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= data.length - 1; i++) {
			System.out.print(inputTitle);
			data[i] = sc.nextInt();
		}
	}

	static void showNumbers(int[] data) {
		for (int a : data) {
			System.out.print(a + " ");
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

	static int findMax(int[] data, int start, int end) {
		int max = data[start];
		int maxIx = start;
		for (int i = start; i < end; i++) {
			if (max < data[i]) {
				max = data[i];
				maxIx = i;
			}
		}
		return maxIx;

	}

	static int findMin(int[] data, int start, int end) {
		int min = data[start];
		int minIx = start;
		for (int i = start; i < end; i++) {
			if (min > data[i]) {
				min = data[i];
				minIx = i;
			}
		}
		return minIx;
	}

	// 배열에서 ix1과 ix2 값을 교환
	static void swap(int []data, int ix1, int ix2) {
		int a = data[ix1];
		data[ix1] = data[ix2];
		data[ix2] = a;
		
	}
	
	// length만큼 긴 배열을 생성해서 until까지 랜덤값을 사용, 배열을 리턴
	static int[] getRandomArray(int length, int until) {
		int [] data = new int [length];
		Random r = new Random(until);
		for(int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(until);
		}
		return data;
	}
}
