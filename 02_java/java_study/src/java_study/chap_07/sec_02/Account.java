package java_study.chap_07.sec_02;

public class Account {

	public String name;
	public String ssn;
	public int balance;
	
//	public Account (String name, String ssn, int balance) {
//		this.name = name;
//		this.ssn = ssn;
//		this.balance = balance;
//	}
	public Account() {
		super();
	}

	
	
	public int getMoney() {
		return balance;
	}
	
	public void setMoney(int money) {
		this.balance = money;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSsn() {
		return ssn;
	}



	public void setSsn(String ssn) {
		this.ssn = ssn;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public Account(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	
	public Account(String name, String ssn, int balance) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "Account [이름=" + name + ", ssn=" + ssn + ", 잔액=" + balance + "]";
	}

}
