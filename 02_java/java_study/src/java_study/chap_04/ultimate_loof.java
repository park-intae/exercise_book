package java_study.chap_04;

public class ultimate_loof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("시작");
		long sum = 0;

		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("끝 " + sum);
	}

}
