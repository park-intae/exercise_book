package java_study.chap_16.sec_01;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		FileReader fr = new FileReader("C:/Temp/test.text");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
			}
		fr.close();

	}

}
