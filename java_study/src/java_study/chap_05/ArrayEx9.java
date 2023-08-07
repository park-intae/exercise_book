package java_study.chap_05;

public class ArrayEx9 {

	static int findMax(int[] data) {
		int max = data[0];
		int maxIx = 0;
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
				maxIx = i;
			}
		}
		return maxIx;

	}

	static int findMin(int[] data) {
		int min = data[0];
		int minIx = 0;
		for (int i = 0; i < data.length; i++) {
			if (min > data[i]) {
				min = data[i];
				minIx = i;
			}
		}
		return minIx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] save = new int[5];

		Array7.getNumbers("숫자입력", save);
		int maxIx = findMax(save);
		int minIx = findMin(save);

//		int max = save[0];
//		for (int i = 0; i < save.length; i++) {
//			if (max < save[i]) {
//				max = save[i];
//			}
//		}
//
//		int min = save[0];
//		for (int i = 0; i < save.length; i++) {
//			if (min > save[i]) {
//				min = save[i];
//			}
//		}

//		int max = save[0];
//		int min = save[0];
//		for (int i = 0; i < save.length; i++) {
//			if (max < save[i]) {
//				max = save[i];
//			}
//			if (min > save[i]) {
//				min = save[i];
//			}
//		}

		System.out.println("최고값 : " + save[maxIx]);
		System.out.println("최소값 : " + save[minIx]);
	}

}
