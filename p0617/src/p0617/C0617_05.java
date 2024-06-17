package p0617;

public class C0617_05 {

	public static void main(String[] args) {
		/*
		// 이항연산자의 특징(6)
		 * float pi = 3.141592f;
		 * float pi  
		 * */
		float pi = 3.141592f;
		System.out.println(pi*1000/1000); // 3.141592

		System.out.println((int)(pi*1000)/1000); // 3 (int/int)->int
		System.out.println((int)(pi*1000)/1000f); // 3.141  (int/float)-> float
		// (int)(pi*1000) : (int)3141.592 -> 3141
		// (int)(pi*1000)/1000f : (int)3141.592/1000f -> 3.141
		
		System.out.println((Math.round(pi*1000)/1000f));
		// Math.round(3141.592)
		// 반올림 결과 : 3142
		// 3142/1000f = 3.14
		
		
		/*
		// 나머지 연산자 %
		- 나누기한 나머지 반환
		- 홀수, 짝수 등 배수검사에 주로 사용
		
		int share = 10/8;
		int remain = 10%8
		
		// 쉬프트 연산자 : <<, >>, >>>
		 * - 2^n으로 곱하거나
		 * 
		 
		 // 비교연산자 
		  *  
		 * */
		int a = 10;
		int b = 10;
		System.out.println(a != b); // false
		System.out.println(a == b); // true
				
		/* 
		 // 비교연산자 (2)
		 * 'A' < 'B' -> 65 < 66 ->true
		 * '0' == 0 -> 48 == 0 -> false
		 * 'A' != 65 -> 65 != 65 -> false
		 * 10.0d == 10.0f -> 10.0d == 10.0d -> true
		 * 0.1d == 0.1f -> 0.1d==0.1d -> false
		 * (float)0.1d == 0.1f -> 0.1f==0.1f -> true
		 * 
		// 비트연산자 : &, | ^
		 *
		 * 
		// 논리연산자 : &&(and), ||(or)
		 * 
		 * int i = 7;
		 * i>3 && i<5; // false
		 * i>3 || i<0; // true
		 * 
		 *  
		 * */

	}

}
