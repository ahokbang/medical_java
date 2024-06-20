package p0620;

import java.util.Scanner;

public class C0620_04 {

	public static void main(String[] args) {
		/* 객체지향
		 * - 클래스 : 배열보다 한 차원 높아. 
		 * 클래스의 정의 : 클래스란 객체를 정의해 놓은 것
		 * 클래스의 용도 : 클래스는 객체를 생성하는데 사용
		 * 
		 * - 객체 = 인스턴스
		 * 객체의 정의 : 실제로 존재하는 것. 사물 또는 개념.
		 * 객체의 용도 : 객체의 속성과 기능에 따라 다름.
		 * 객체의 구성요소 : 속성과 기능
		 * 	  
		 * 클래스       객체
		 * 제품설계도    제품
		 * TV 설계도    TV
		 * */ 
		
		// 클래스는 하나의 묶음이다. python의 리스트가 클래스의 개념
		// 클래스는 정의를 내리는 곳
		
		// 변수선언
		Scanner scan = new Scanner(System.in);
		
		String tvColor = "white";		
		boolean power = false;
		int channel = 0;
		
		String tvColor2 = "white";		
		boolean power2 = false;
		int channel2 = 0;
		
		String tvColor3 = "white";		
		boolean power3 = false;
		int channel3 = 0;		
		
//		int num = 0;
//		String str = new String("aaa");
		
 
		// 객체 선언 : 객체 선언 없이 절대 클래스를 쓸 수 없다.
		// 클래스명 참조변수명 = new 클래스타입();
		// 클래스타입 참조변수명 = new 클래스타입();
		// 객체 선언 방법 1 
		Tv t1 = new Tv();
		// 객체 선언 방법 2  

		Tv t2 ; 		// 객체 생성한 후에 생성된 객체의 주소를 참조변수에 저장. 
		t2= new Tv();   // 객체를 다루기 위한 참조변수가 선언
		System.out.println("tv2 : "+t2);
		
		Tv t3 = new Tv();
		
		// 배열의 선언과 구조 동일
		int[] num; // 배열을 다루기 위한 참조변수가 선언
		num = new int[5]; // 배열 생성 후 생성된 배열의 주소를 참조변수에 저장
		System.out.println("num : "+num);
		
				
		t1.color = "white";
		t1.power = false;
		t1.channel = 0;
		
//		String color = "white";
//		boolean power = false;
//		int channel = 0;
//		// volume, size, ...
//		
//		while (true) {
//			System.out.println("1. TV 켜기");
//			System.out.println("2. TV 끄기");
//			System.out.println("------------------");
//			System.out.println("TV 상태를 선택하세요. >> ");
//			int choice = scan.nextInt();
		
//		} // while
		
		
		
		
	}

}
