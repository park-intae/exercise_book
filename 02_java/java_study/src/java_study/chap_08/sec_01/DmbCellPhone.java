package java_study.chap_08.sec_01;

public class DmbCellPhone extends CellPhone{
	int ch;
		
//	DmbCellPhone(String model, String color, int ch) {
//		super(model,color);
//		this.ch = ch;
//	}

	public DmbCellPhone(int ch) {
		super();
		this.ch = ch;
	}
	
	public DmbCellPhone(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	void turnOnDmb() {
		System.out.println("채널 " + ch + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int ch) {
		this.ch = ch;
		System.out.println("채널 " + ch + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
