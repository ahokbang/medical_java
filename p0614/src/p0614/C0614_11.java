package p0614;

public class C0614_11 {

	public static void main(String[] args) {
		// 
		byte a = 1;
		int n = 10;
		
		// byte c = a + n ; // type mismatch error
		byte c = (byte) (a+n);
		System.out.println(c); // 11
		
		/*
		 * n = 250으로 하고,
		 *  System.out.println(c); 하면
		 *  -5 출력 --> overflow
		 *  byte는 127까지만 출력
		 * */
		
		int n2 = 350;
		
		int d = a + n2;
		System.out.println(d); // 351
		
		char ch = 'A'; //65 
		char ch2 = 'B'; //66
		System.out.println(ch+ch2); //131
		// A=65, a=97 ==> 32 차이
		System.out.println((char)(ch+32)); // a
		
		
		byte by = 10;
		byte by2 = 20;
		// byte by3 = by + by2; // error byte+byte = int이므로
		byte by3 = (byte) (by+by2);
		System.out.println(by3);
		
		int num = 1000000;
		int num2 = 2000000;
		long total = (long) num * num2;
		System.out.println("long : "+total); // -1454759936 
											 // int * int --> 2조, int는 21억까지만 가능 ==> long으로 변경
		// 아니면 num 또는 num2의 값을 long으로 변경
		
//		int num3 = 1000000;
//		long num4 = num*num3;
//		System.out.println(num4); // overflow 발생
		
		long num3 = 1000000L; // num3을 long으로 변환
		long num4 = num*num3;
		System.out.println(num4); // 1000000000000
		
		int num5 = 1000000;
		System.out.println(num/num5*1000000); // 1000000
		System.out.println(num*num5/1000000); // -727, overflow 발생
		
		
		char c1 = 'a';
		// char c2 = c1 + 1; // error
		char c2 = (char) (c1+1);
		System.out.println(c2); // b
		
//		char c3 = c1++;
//		System.out.println(c3); // a

		char c3 = ++c1;
		System.out.println(c3); // b
		
		int i = 'B' - 'A' ;// A=65, B=66, C=67, D= 68, ... , a = 97, b = 98, c = 99, ...
		System.out.println(i); // 1
		
		// 문자 숫자는 - 문사 숫자 '0'을 빼면 숫자 값이 나옴
		int j = '2'-'0'; // '0' = 48, '1' = 49, '2' = 50
		System.out.println(j); // 2

		int k = '8' - '0';
		System.out.println(k); // 8
		
		
	}

}
