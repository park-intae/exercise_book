package java_study.chap_09.sec01;

public class Audio implements RemoteControl {
	private int vol;
	
	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");

	}


	@Override
	public void setVolum(int vol) {
		// TODO Auto-generated method stub
		if (vol > RemoteControl.MAX_VOLUME) {
			this.vol = RemoteControl.MAX_VOLUME;
		} else if (vol < RemoteControl.MIN_VOLUME) {
			this.vol = RemoteControl.MIN_VOLUME;
		} else {
			this.vol = vol;
		}
	System.out.println("현재 Audio 볼륨: " + vol);
	}
}

