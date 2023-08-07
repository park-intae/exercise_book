package java_study.chap_04;

import java.util.Random;
import java.util.Scanner;

public class game_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int draw = 0;
		int win = 0;
		int loose = 0;

		while (true) {
			int computer = r.nextInt(3);
			System.out.print("가위=0,바위=1,보=2,종료=-1 >> \n");
			int me = sc.nextInt();

			if (me == -1) {
				System.out.print("게임이 종료되었습니다. \n");
				System.out.print("승리" + win + "회 \n");
				System.out.print("패배" + loose + "회 \n");
				System.out.print("무승부" + draw + "회 \n");
				int sum = win + loose;
				double result = (double) (win / sum * 100);
				System.out.print("승률" + (int) result + "%");

				break;
			}

			System.out.printf("컴퓨터: %d, 나: %d", computer, me);

			if (me == computer) {
				System.out.print("==> 비김 \n");
				draw++;
				System.out.print("무승부" + draw + "회 \n");
			} else if ((me == SCISSORS && computer == PAPER) || (me == ROCK && computer == SCISSORS)
					|| (me == PAPER && computer == ROCK)) {
				System.out.print("==> 이김 \n");
				win++;
				System.out.print("승리" + win + "회 \n");
			} else {
				System.out.print("==> 짐 \n");
				loose++;
				System.out.print("패배" + loose + "회 \n");
			}

		}
	}

}
