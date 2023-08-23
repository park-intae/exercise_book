package java_study.chap_04;

import java.util.Random;
import java.util.Scanner;

public class game_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int computer = r.nextInt(3);
		System.out.print("가위=0,바위=1,보=2 >> \n");
		int me = sc.nextInt();

		System.out.printf("컴퓨터: %d, 나: %d", computer, me);

		if (me == computer) {
			System.out.print("비김 \n");
		} else if ((me == SCISSORS && computer == PAPER) || (me == ROCK && computer == SCISSORS)
				|| (me == PAPER && computer == ROCK)) {
			System.out.print("이김 \n");
		} else {
			System.out.print("짐 \n");
		}
	}

}
