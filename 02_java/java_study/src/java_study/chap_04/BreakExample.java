package java_study.chap_04;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) { // 주사위 반복 굴리기
			int num = (int) (Math.random() * 6) + 1; // 1~6랜덤 실수를 정수로 변환해서 저장
			System.out.print(num + "\n"); // 주사위
			if (num == 6) {
				break;
			} // 6이 나오면 종료
		}
		System.out.print("프로그램 종료");
	}

}