package java_study.chap_07.sec_02;

public class AccountUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account("홍길동", "990115", 100000);
		System.out.println(a1);
		
		Account a2 = new Account("고길동", "900115", 2000000);
		System.out.println(a2);
		
		// 현재 잔액만 출력
		a2.setMoney(20000000);
		
		System.out.println(a2.getMoney());
		System.out.println(a2);
	}

}
