package java_study.chap_04;

import java.util.Date;

public class switch_ex_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay();
		System.out.println(day);

		switch (day) {
		case 0:
		case 6:
			System.out.println("공부하셈");
			break;
		default:
			break;

		}
	}

}
