package java_study.chap_06.sec_03;

public class Block {
	
	int x = 10;
	int y = 20;
	String color = "red";
	
	public void stack() {
		int move = 50;
		System.out.println(move + " 만큼 벽돌을 쌓다");
	}

	@Override
	public String toString() {
		return "Block [color=" + color + ", x=" + x + ", y=" + y + "]";
	}
	

//	public String toString() {
//		return "block[x=" + x + ", y = " + y + ", color="+ color + "]";
//	}

	
	
}
