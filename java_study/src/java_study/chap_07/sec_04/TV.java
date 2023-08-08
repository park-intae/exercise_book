package java_study.chap_07.sec_04;

public class TV {
	private int ch;
	private int vol;
	private boolean onOff;
	private static int serial;
	
	static int count = 0; //static 멤버는 초기값을 명시적으로 주는게 관례

	
	public TV() {
		super();
		
		count ++;
		serial = count;
	}
	
	public TV(int ch, int vol, boolean onOff) {
		super();
		
		count ++;
		serial = count;
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}

	public static int getSerial() {
		return serial;
	}

	public static void setSerial(int serial) {
		TV.serial = serial;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public boolean isOnOff() { 			//boolean 타입은 true/false여부를 가리기 때문에 get이 아니라 is
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
	
}
