package java_study.chap_04;

public class Continue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i);
		}
	}

}
