package java_study.chap_05;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int y = 200;

		System.out.printf("x : %d, y : %d \n", x, y);

		swap(x, y);

		System.out.printf("x : %d, y : %d \n", x, y);
	}

	static void swap(int x, int y) {
		int z = x;
		x = y;
		y = z;
		System.out.printf("x : %d, y : %d \n", x, y);
	}

}
