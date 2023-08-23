package java_study.chap_12.sec_01;

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
}
