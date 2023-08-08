package java_study.chap_07.sec_07;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
	return singleton;
	}
}
