package java_study.chap_07.sec_04;

public class TvControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TV.count);
		
		TV tv1 = new TV(7,30,false);
		TV tv2 = new TV(8,24,true);
		
		System.out.println(tv1);
		System.out.println(tv2);
		System.out.println(TV.count);
		
		TV[] tvArr = new TV[100];
		for(int i = 0; i < 100; i++) {
			TV tv = new TV(1,1,true);
			tvArr[i] = tv;	
		}
		
		TV tv3 = new TV();
		tv3.setCh(30);
		System.out.println(tv3.getCh());
		System.out.printf("tv3의 시리얼 넘버는 %d \n", tv3.getSerial());
		
		System.out.println(tv1.getCh());
		System.out.println(tv2.getCh());
		System.out.println(tvArr[0]);
		System.out.printf("tv1의 시리얼 넘버는 %d \n", tv1.getSerial());
		
		TV[] tvArra = { new TV (10,10,false), new TV (9,9,false), new TV (8,8,false)};
		System.out.println(TV.count);
	}

}
