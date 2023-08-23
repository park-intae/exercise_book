package java_study.chap_07.sec_03;

public class ComputerMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Computer(100000,"samsung",30);
		Computer c2 = new Computer(80000,"lg",25);

		
		System.out.println(c1);
		System.out.println(c2);
		
		Computer c3 = new Computer();
		c3.setPrice(10000);
		c3.setMaker("apple");
		c3.setSize(24);
		
		System.out.println(c3);
	}

}
