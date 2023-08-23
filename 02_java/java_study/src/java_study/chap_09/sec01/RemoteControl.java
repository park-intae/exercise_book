package java_study.chap_09.sec01;

public interface RemoteControl {
	int MAX_VOLUME = 100; //상수 = 이텔릭 체
	int MIN_VOLUME = 0;
	
	void turnON(); // "public abstract" 생략가능
	void turnOn();
	void setVolum(int vol);
	
	//기본 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거되었습니다");
		}else {
			System.out.println("음소거 해제 되었습니다");
		}
	}
	
	//static 메소드
	static void changeBettery() {
		System.out.print("건전지를 교체합니다");
	}
}
