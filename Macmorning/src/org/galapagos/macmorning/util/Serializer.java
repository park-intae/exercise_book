package org.galapagos.macmorning.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.galapagos.macmorning.vo.Member;

public class Serializer {
		public static Object load(String filePath, List<Member> memberList) throws Exception {
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
