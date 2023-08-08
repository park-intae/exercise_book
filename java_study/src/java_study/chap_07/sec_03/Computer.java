package java_study.chap_07.sec_03;

public class Computer {
	int price;
	String maker;
	int size;
	
	public Computer() {
		
	}

	public Computer(int price, String maker, int size) {
		super();
		this.price = price;
		this.maker = maker;
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", maker=" + maker + ", size=" + size + "]";
	}
	
	
}
