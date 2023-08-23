package java_study.chap_04;

public class while_loof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// 100까지 더하기
		int sum = 0;

		i = 0;

		while (i <= 100) {
			sum += i;

			i++;

		}
		System.out.print(sum);

	}

}
