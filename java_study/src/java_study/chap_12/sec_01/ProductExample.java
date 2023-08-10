package java_study.chap_12.sec_01;

public class ProductExample {
	public static void main(String[] args) {
		Product <Tv,String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product <Car,String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("중형세단");
		Car car = product2.getKind();
		String carModel = product2.getModel();		
		
	}
}
