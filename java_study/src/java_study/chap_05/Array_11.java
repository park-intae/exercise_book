package java_study.chap_05;

import java.util.Random;

public class Array_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] jumsu = new int [10000];
//		Random r = new Random(5);
//		for(int i = 0; i < jumsu.length; i++) {
//			jumsu[i] = r.nextInt(331);
//		}
		
		int [] jumsu = ArrayUtil.getRandomArray(10000, 331);
		
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 330) {
				count ++;
				System.out.printf("%d : 만점자 번호 %d\n",count, i);
			}
		}
		System.out.printf("전체 만점자 수는 %d 명 입니다", count);
	}

}
