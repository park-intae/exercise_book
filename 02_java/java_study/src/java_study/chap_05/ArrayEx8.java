package java_study.chap_05;

public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grade = new int[5];

		Array7.getNumbers("점수>>", grade);
		Array7.showNumbers(grade);
		int sum = Array7.addAll(grade);

		double aver = (double) sum / grade.length;
		System.out.print("평균 :" + aver);

	}

}
