package java_study.chap_04;

import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();

		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();

		System.out.printf("%d시 %d분 %d초 \n", hour, min, sec);

		int year = date.getYear();
		int month = date.getMonth() + 1;
		int day = date.getDay();

		System.out.printf("%d년 %d월 %d일 \n", year + 1900, month, day);

		System.out.printf("%4d.%02d.%02d %02d:%02d:%02d", year + 1900, month, day, hour, min, sec);
	}

}