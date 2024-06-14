package p0614;

public class C0614_06 {

	public static void main(String[] args) {
		// 형변환(casting)
		// boolean을 제외한 7개의 기본형은 서로 형변환 가능
		/*
		 int -> char , (char), 'A'
		 char -> int, (int), 'A'
		 
		 */
		
		float f = 1.6f;
//		int i = f; // error
		// 큰 자료형에서 작은 자료형으로 변환할 때는 앞에 (자료형) 붙여주어야 함. 강제형변환
		int i = (int) f; // float 타입을 int 타입으로 변경
		System.out.println(i);
		
		int n = 10;
		// 작은 자료형에서 큰 자료형으로 변환할 때는 생략 가능
		float f1 = n;
		System.out.println(n); // 10
		System.out.println(f1); // 10.0
		
		// 정수형보다 실수형이 더 큼(소숫점이 있어 숫자표현에 더 많이 쓸 수 있어)
		// byte<short<int<long<float<double
		// byte가 제일 작고 double이 가장 큼.
		
		int n2 = 65;
		char ch = (char) n2; // 형변환
		System.out.println(ch); // A
		
		char ch2 = 'a';
		int n3 = (int) ch2;
		System.out.println(n3); // 97
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2); // 10.0
		
		
	}

}
