package java_study.chap_05;

public class ArrayExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "홍길동", "김길동", "박길동", "정길동", "송길동" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "");
		}

		System.out.println();

		int[] ages = { 50, 40, 30, 20, 10 };
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i] + "");
		}

		System.out.println();
		int[] shoes = { 134, 235, 245, 255, 300 };
		for (int i = 0; i < shoes.length; i++) {
			System.out.println(shoes[i] + "");
		}

		System.out.println();
		char[] gender = { '남', '여', '남', '남', '여' };
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i] + "");
		}

		System.out.println("이름 나이 신발크기 성별");
		System.out.println("-------------------------");
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%d %s %d %d %c\n", i + 1, names[i], ages[i], shoes[i], gender[i]);
		}

	}

}
