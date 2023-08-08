package java_study.chap_07.sec_05;

public class BbsUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("게시판");
		System.out.println("------------");
		System.out.println("no	title	content	writer");
		
//		String[] title = {"java", "jsp", "spring"};
//		String[] content = {"fun java", "fun jsp", "fun spring"};
//		String[] writer = {"park", "hong", "kim"};
//		for(int i = 0; i < bd.length; i++) {
//			Bbs[] bds = { new Bbs {i, title[i], content[i], wirter[i] } };
//			System.out.println(bd[i]);
//		}
//		
		
		Bbs[] bdArr = { new Bbs(1, "java", "fun java", "park"), new Bbs(2, "jsp", "fun jsp", "hong"), new Bbs(3, "spring", "fun spring", "kim") };
		
		// method[] Array = { new method(ele1, ...), ...}
		
		for(Bbs bd : bdArr) {
			System.out.printf("%-3d %-10s %-10s %-10s \n", bd.getNum(), bd.getTitle(), bd.getContent(), bd.getWriter());
		}
		
	}

}
