package java_study.chap_05;

public class CallByReferenceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 100, 200 };

		System.out.printf("%d %d \n", data[0], data[1]);

		swap(data);
		System.out.printf("%d %d \n", data[0], data[1]);
	}

	static void swap(int[] data) {
		int z = data[0];

		data[0] = data[1];
		data[1] = z;

		System.out.printf("%d %d \n", data[0], data[1]);
	}
}
