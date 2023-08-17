package java_study.chap_16.sec_01;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		File file = new File("C:/Temp/write_t.txt");
		try (FileWriter fw = new FileWriter(file, true)) {
			fw.write("Filewriter는 한글로 된 file /r/n");
			fw.write("문자열 바로 출력하기! /r/n");
			fw.flush();
			System.out.println("파일 저장 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
