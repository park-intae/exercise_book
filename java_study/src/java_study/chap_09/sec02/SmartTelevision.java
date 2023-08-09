package java_study.chap_09.sec02;
import java_study.chap_09.sec01.RemoteControl;
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		}
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume);
	}
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	@Override
	public void serch(String url) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setVolum(int vol) {
		// TODO Auto-generated method stub
		
	}

}
