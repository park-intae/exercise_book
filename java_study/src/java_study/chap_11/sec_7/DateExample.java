package java_study.chap_11.sec_7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초"); //SimpleDateFormat 기억해두자, hh는 12시간 기준/ HH는 24시간 기준
		String strNow2 = sdf.format(now); // 이걸로 yy~를 받아서 표시
		System.out.println(strNow2);
		
		
	}

}
