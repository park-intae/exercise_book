package java_study.chap_04;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			System.out.println("-----------------");
			System.out.println("1.증속|2.감속|3.중지");
			System.out.println("-----------------");
			System.out.print("선택: \n");

			keyCode = System.in.read();

			if (keyCode == 49) {
				speed++;
				System.out.print("현재 속도는 " + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.print("현재 속도는 " + speed);
			} else if (keyCode == 51) {
				run = false;
			}
			System.out.print("프로그램 종료");
		}
	}

}
