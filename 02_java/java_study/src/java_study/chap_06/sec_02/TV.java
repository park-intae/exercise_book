package java_study.chap_06.sec_02;

public class TV {
	public String size;
	public String quality;
	public String price;
	public String maker;
	
	public int ch;
	public int vol;
	public boolean volUpDown;
	public boolean onoff;
	
	public void turn() {
		System.out.print("전원버튼 누르기\n");
		if (onoff == false) {
			System.out.print("전원켜짐\n");
		}else {
			System.out.print("전원꺼짐\n");
		}
	}
	
	public void turnCh() {
		System.out.print("채널번호 누르기\n");
		System.out.print("채널 옮기기\n");
	}
	
	public void turnVolu() {
		System.out.print("볼륨버튼 누르기\n");
		if(volUpDown == true) {
			System.out.print("음량증가\n");
		} else {
			System.out.print("음량감소\n");
		}
	}
}
