package p0614;

public class C0614_01 {

	public static void main(String[] args) {
		
		// 논리형(boolean)
		boolean bol = true;
		boolean bo2 = false;
		
		// 문자형
		char ch1 = 'a';
		// char ch2 = 'xx'; // error 발생, char는 문자 1개만 저장 
		char ch3 = ' '; // 빈공백 저장은 가능
		// char ch4 = ''; // error
		
		// 정수형: byte, short, int(default로 접미사 안 붙여도 됨), longL(접미사 L 붙어야 함)
//		byte a = 128; // byte 127까지 입력 가능, 그 이상은 에러 발생
		short b = 32767; // short 32767까지
//		int c = 2147483648; // int 2147483647까지
		long d = 2147483648L; // int 이상의 숫자에서는 L을 추가해주어야 해
		
		// 실수형 : 
           // float(접미사 F 붙어야 함, 소숫점 8자리까지) 
		   // double(접미사 D 붙여도 되고 안 붙여도 돼소숫점 16자리까지) 소수점 자리 넘어가면 다른 class 사용해야 함.
//		float e = 3.14; // 에러
		float e = 3.14F; // 접미사 F 무조건 붙어야 함
		double f = 3.14; // 접미사 D 생략 가능
		
		
		// 정수형 - byte, short, int, long 타입
//		int num = 10; // ; 꼭 넣어주어야 해!
//		System.out.println(num); // print(num);은 안돼

	} // main

} // class
