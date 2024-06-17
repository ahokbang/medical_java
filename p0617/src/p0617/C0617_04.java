package p0617;

import java.util.Scanner;

public class C0617_04 {

	public static void main(String[] args) {
		// 참조형 변수의 형변화
		Scanner scan = new Scanner(System.in);

		/* 이항연산자의 특징(1) : 이항연산자는 연산을 수행하기 전에 피연산자의 타입을 일치시킨다.
		- int보다 크기가 작은 타입은 int로 변환(byte, char, short -> int)
		- 피연산자 중 표현범위가 큰 타입으로 형변환
		  byte + short -> int + int -> int
		  char + int -> int + int -> int
		  float + int -> float + float -> float
		  float + double -> double + double -> double
		  
		  이항연산자의 특징(2) 
		  byte a = 10;
		  byte b = 20;
		  byte c = a + b;
		  
		  이항연산자의 특징(3)
		  int a = 100000;
		  int b = 200000;
		  long c = a*b = -14547599 
		                // int*int=int이기 때문에 overflow 발생
		  long c = (long) a * b = 20000000000;
		  
		  이항연산자의 특징(4)
		  long a = 10000000 * 1000000 // -727,379,968
		  long b = 10000000 * 1000000L // 1,000,000,000,000
		  int c
		  ind d
		  
		  이항연산자의 특징(5)
		  char c1 = 'a';
		  char c2 = c1+1; // error
		  char c2 (char)(c1+1); // ok
		  char c2 = ++c1; // ok, 자주 사용하지 않아.
		  
		  // 영문 소문자에서 대문자로 치환 --> - 32, 대문자에서 소문자로 치환 --:> +32 // ***** [ 외우기 ] *****
		  int i = 'B'-'A'; // 1 (66 - 65 = 1) // ***** [ 외우기 ] *****
		  int i = '2'-'0'; // 2 // ***** [ 외우기 ] *****
		  
		 * */
		
		char ch = 'a';
		System.out.println((char)(ch-32)); // A, 영문소문자에서 대문자로 변환하는 방법 ***** [ 외우기 ] *****
		
		char ch2 = 'A';
		System.out.println((char)(ch2+32)); // a, 영문 대문자에서 소문자로 변환하는 방법 ***** [ 외우기 ] *****
		
		char ch3 = '3';
		char ch4 = '2';
		System.out.println((ch3-ch4)); // 1, 아스키코드로 0=48, 1=49, 2=50, 3=51
		System.out.println((ch3+ch4)); // 101, 아스키코드로 0=48, 1=49, 2=50, 3=51
		
		// 문자 숫자타입을 정수타입으로 변경하는 방법 : '0' 문자 0을 빼줌 ***** [ 외우기 ] *****
		System.out.println((ch3-'0')+(ch4-'0')); // 5	
		
//		int a = 100000;
//		int b = 100000;
//		System.out.println(a*(long)b); // 10000000000
		
//		char ch = 'A'; // 아스키코드로 A=65 , a=97, 0=48
//		char ch2 = 'B'; // 아스키코드로 B=66
//		System.out.println(ch+ch2); // 131 (char+char = int가 되기 때문에 숫자로 변환됨)
//		
//		System.out.println("숫자를 입력하세요.");
//		String str = scan.nextLine();
//		// String : 기본형타입이 아닌 참조형변수. 참조형변수는 그냥 바꿀 수 없어.(기본형은 강제형변환)
//		int n = Integer.parseInt(str); // 문자열을 정수형으로 변환. ***** [매우 중요] *****
//		System.out.println("숫자를 입력하세요.");
//		String str2 = scan.nextLine();
//		int n2 = Integer.parseInt(str2);
//		// System.out.println("두 수의 합 : "+(str+str2)); //04091019
//		System.out.println("두 수의 합 : "+(n+n2));
		
//		System.out.println("숫자를 입력하세요.");
//		int n = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		int n2 = scan.nextInt();
//		System.out.println("두 수의 합 : "+(n+n2));

	}

}
