package java_study.chap_16.sec_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {
	public static Object load(String filePath) throws Exception {
		// 호출한 쪽에서 예외처리
		// close만 자동화
		try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis);) {
			return ois.readObject();
		}
	}

	public static void save(String filePath, Object obj) throws Exception {
		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(obj);
			oos.flush();
		}
	}
}
