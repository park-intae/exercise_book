package java_study.chap_04;

public class Times_Table__double_loof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m = 2; m <= 9; m++) {
			System.out.print("****" + m + "****\n");
			for (int n = 1; n <= 9; n++) {
				int r = m * n;
				System.out.printf("%d X %d = %d \n", m, n, r);
			}
		}
	}

}
