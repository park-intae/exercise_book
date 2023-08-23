package java_study.chap_08.sec_09;

public class AnmalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound();
		cat.sound();

		System.out.println("-----");

		// 변수의 자동 타입 변환

		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();

		System.out.println("-----");

		// 매개변수의 자동 타입 변환

		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}