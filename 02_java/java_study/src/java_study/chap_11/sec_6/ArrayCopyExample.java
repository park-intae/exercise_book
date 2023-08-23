package java_study.chap_11.sec_6;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1 = { 'j','a','v','a'};
		
		//방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));

		//방법4
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
	}
}
