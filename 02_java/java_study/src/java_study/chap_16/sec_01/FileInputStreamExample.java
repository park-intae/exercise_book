package java_study.chap_16.sec_01;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:/temp/test.txt")){
		
			int data;
			while((data=fis.read()) != -1) {
				System.out.write(data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
