package java_study.chap_05;

public class ArrayExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4 };
		int[] arr2 = new int[] { 5, 6, 7, 8 };

		// arr = {10, 11, 12} <<오류, 선언문에서만 'new int[]'를 축약할 수 있다
		arr = new int[] { 10, 11, 12 }; // << arr에 재할당

	}

}
