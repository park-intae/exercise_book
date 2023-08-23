package java_study.chap_16.sec_02;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	public static void main(String[] args) {
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;
		classA.field3 = 4;

		save("c:/temp/objcet2.dat", classA);
	}

	public static void save(String filePath, Object obj) throws Exception {
		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(obj);
			oos.flush();
		}

	}
}
