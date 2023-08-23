package java_study.chap_05;

public class ArrayEx10 {
	// 베열 입력을 받아서
	// 최솟값을 인덱스 0번의 값과 교환
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] data = new int[5];
//		// 데이터 입력받기
//		ArrayUtil.getNumbers("숫자입력 >>", data);
		
		int[] data = ArrayUtil.getRandomArray(10, 100);
		
		for(int i = 0; i < data.length; i++) {
		int minIx = ArrayUtil.findMin(data, i, data.length);
		ArrayUtil.swap(data, i, minIx);
		ArrayUtil.showNumbers(data);
		}
		
		ArrayUtil.showNumbers(data);
		
	}

}
