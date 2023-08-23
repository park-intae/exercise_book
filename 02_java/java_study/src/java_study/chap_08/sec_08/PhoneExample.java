package java_study.chap_08.sec_08;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Phone phone = new Phone(); //선언 불가
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		Phone phone = new SmartPhone("김길동");
		
		phone.turnOff();
		((SmartPhone)phone).internetSearch(); //다운 
		phone.turnOff();
	}

}
