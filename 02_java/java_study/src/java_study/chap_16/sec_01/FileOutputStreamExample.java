package java_study.chap_16.sec_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {

		String originalFileName = "C:/temp/waktaverse.png";
		String targetFileName = "C:/Temp/waktaverse_copy.png";
		
		try(FileInputStream fis = new FileInputStream(originalFileName);
			FileOutputStream fos = new FileOutputStream(targetFileName);){
			
			int readByteNo;
			byte[] readBytes = new byte[100];
			while( (readByteNo = fis.read(readBytes)) != -1 ) {
				fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		System.out.println("복사완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
