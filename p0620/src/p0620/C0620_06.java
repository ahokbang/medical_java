package p0620;

public class C0620_06 {

	public static void main(String[] args) {
		// 클래스, 정의
		/*클래스의 또 다른 정의
		 * 1. 함수 저장
		 * 
		 * 
		 * 
		 * 변수 : 하나의 데이터를 저장할 수 있는 공간
		 * 배열 : 같은 타입의 여러 데이터를 저장할 수 있는 공간
		 * 구조체 : 타입에 관계 없이
		 * */
		int a = 10;
		int b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println((a+1)+(b+1));
		System.out.println((a+1)-(b+1));
		System.out.println((a+1)*(b+1));
		System.out.println((a+1)/(b+1));
		
		
		
		int num = 0;
		int num2 = 10;
		num2 = num;
		System.out.println("num2 : "+num2);
			
		
		
		// 객체 선언
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t2 ch : "+t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t2 ch : "+t2.channel);
		
		
//		// Class는 객체 선언
//		Tv t = new Tv();
//		// 참조변수명. 변수명 값을 넣을 수 있음.
//		t.channel = 7;
//		t.channelUP();
//		System.out.println("현재 채널 : "+t.channel);
//		t.channelDown(); // 7
//		t.channelDown(); // 6		
//		System.out.println("현재 채널 : "+t.channel);

	}

}
