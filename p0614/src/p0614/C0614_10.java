package p0614;

public class C0614_10 {

	public static void main(String[] args) {
		// 증감연산자
		/*
		 증가연산자 ++ : 피연산자의 값을 1 증가
		 감소연산자 -- : 피연산자의 값을 1 감소
		 
		 전위형 증감연산자 : 
		 후위형 증감연산자 : 
		 */
		
		// 전위형 증감연산자
//		int i = 5;
//		int j = 0;
//		j = ++i; // i=5 + 1
//		System.out.println(j); // 6

		// 후위형 증감연산자
		int i = 5;
		int j = 0;
		j = i++; // i=5 -> j에 넣음. i+1=6 
		System.out.println("j : "+j); // 5
		System.out.println("i : "+i); // 6
		
		
		/*부호연산자(+,-)와 논리부정연산자
		 
		 
		 int i
		 
		 
		 피연산자가 boolean일 때만 사용 가능
		 boolean power = false;
		 	power = !power; 
		 	power = !power;
		 
		*/
		
		boolean bol1 = true;
		boolean bol2 = false;
		
		System.out.println(bol1 == bol2); // false
		System.out.println(bol1 != bol2); // true
		
		/* 비트전환연산자 ~
		 * 정수를 2진수로 표현했을 때 1을 0으로 0은 1로 바꾼다. 정수형에만 사용 가능. 음수로 바꿀 때 */
		
	}

}
