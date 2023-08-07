package java_study.chap_07.sec_01;

public class Account {
	private String name;
	private int socNum;
	private String accountName;
	private int balance; // 잔액
	int reposite;
	
	public Account () {
		
	}
	
	public Account(String n, String an, int b ) {
		name = n;
		accountName = an;
		balance = b;
	}
	

	
	public void deposite(int amount) {
		balance += amount;
		System.out.println(name + "님의 잔액은 " + amount + " 원 입금하셔서 총 "+ balance + " 원입니다");
	}
//	public void withdraw(int amount) {
//		if(amount < balance) {
//			balance -= amount;
//			System.out.println(account + "님의 잔액은 " + amount + " 원 입금하셔서 총 "+ + balance + "원입니다");
//		} else {
//			System.out.println("잔액이 부족합니다");
//		}
//	}
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔액이 부족합니다");
			return;
			}
		balance -= amount;
		System.out.println(name + "님의 잔액은 " + amount + " 원 입금하셔서 총 "+ + balance + "원입니다");
	}
	
	@Override
	public String toString() {
		return "Account [account=" + name + ", name=" + accountName + ", balance=" + balance + "]";
	}
	
	
	
}
