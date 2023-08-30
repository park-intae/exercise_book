package org.galapagos.macmorning.cli;

import java.util.Scanner;

public class Input {
	static Scanner sc = new Scanner(System.in);
	
	public static String read(String title) {
		System.out.print(title);
		return sc.nextLine();
		
	}
}
