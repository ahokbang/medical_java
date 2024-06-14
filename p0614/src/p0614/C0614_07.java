package p0614;

public class C0614_07 {

	public static void main(String[] args) {
		// 연산자
		
		
		
		
		
		// println의 출력 : 소숫점 제어 불가
		System.out.println(10.0/3); // 3.3333333333333335    소숫점 15자리까지 표현하고 그 이후 자리부터는 마음대로 나옴.
		System.out.println(10.0f/3); // 3.3333333    소숫점 7자리까지 표현하고 그 이후 자리부터는 마음대로 나옴.
		
		// printf의 출력 : 소숫점 제어 가능(소수점 제한 출력 가능), 8진수 및 16진수 출력 가능, 자리수 표시
		System.out.printf("%.2f \n", 10.0/3); // 3.33 // 줄단락 입력해야 함.
		
		int x = 0x1a; // 16진수 표현, 1a 값은? 1*16^1 + a(=10)*16^0 =26
		// 0 , 1, ,3, ..., 9, a, b, c, d, e, f
		System.out.println(x); // 3.3326
		System.out.println("X : " +x);
		System.out.printf("%X \n", x); 
		
		long a = 10L;
		System.out.printf("%d \n", a);
		int b = 20;
		System.out.printf("%d \n", b);

		int age = 14;
		int year = 2024;
		System.out.printf("나이 : %d 세, 년도 : %d 년\n", age, year);
		System.out.println("나이 : "+age+" 세, 년도 : "+year+" 년");
		
		// printf : 자리수 표시
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%5d] \n", 10);
		System.out.printf("[%05d] \n", 10);
	}

}
