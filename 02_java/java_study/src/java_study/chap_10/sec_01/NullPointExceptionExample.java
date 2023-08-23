package java_study.chap_10.sec_01;

import java.io.IOException;

public class NullPointExceptionExample {
	public static void main(String[] args) {
		String data = null;
		System.out.print(data.toString());
		
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
