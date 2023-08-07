package java_study.chap_05;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCharacter('*', 30);
		System.out.println("Hellow, Java");
		printCharacter('-', 20);

		for (int i = 0; i < 5; i++) {
			printCharacter('*', i);
		}

		for (int i = 5; i > -1; i--) {
			printCharacter('*', i);
		}
	}

	static void printCharacter(char ch, int num) {
		for (int cnt = 0; cnt <= num; cnt++) {
			System.out.print(ch);
		}
		System.out.println("");
	}

}
