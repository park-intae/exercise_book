package java_study.chap_06.sec_04;

public class AccountUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account dad = new Account();
		dad.account = "홍길동";
		dad.name = "튼튼적금";
//		dad.balance = 13000;
		
		dad.deposite(1000);
		dad.deposite(4000);
		dad.deposite(10000);
		
		dad.withdraw(2000);
		dad.withdraw(3000);
		dad.withdraw(5000);
		
		System.out.println(dad);
		
		dad.withdraw(30000);
		System.out.println(dad);
	}

}
