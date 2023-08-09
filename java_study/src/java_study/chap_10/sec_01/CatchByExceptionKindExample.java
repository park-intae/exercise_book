package java_study.chap_10.sec_01;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);

		try {
			String data1 = args[0];
			String data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample num1 num2");
		} catch (Exception e) {
			System.err.println("오류발생");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
