package java_study.chap_02;

public class ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;

		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');

		System.out.println(grade);
	}

}