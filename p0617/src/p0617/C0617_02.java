package p0617;

public class C0617_02 {

	public static void main(String[] args) {
		// 연산자
		int a = 10;
		int b = 3;
		System.out.println(a/b); // 3 (int/int=int)
		System.out.println(a/(double)b); // 3.3333333333333335 // ln은 줄단락의 의미
		System.out.print(a/(double)b); // 3.3333333333333335  // 줄 단락 없음.
		System.out.println(10/3.0); // 3.3333333333333335
		System.out.printf("%2f", 10/3.0); // %f : 실수
		// %f : 부동 소수점 형식으로 출력
		System.out.printf("%d \n", 10/3); // %d : 정수 // 줄단락이 없어서 \n 붙여주어야 해
		System.out.printf("%d \t", 10/3); // %d : 정수 // \t: 탭
		// %d : 10진 정수 형식으로 출력
		System.out.println("aaa");
		// 참고로 알아두기, 잘 사용하지 않음
		System.out.printf("%x \n", 15); // 16진수
		System.out.printf("%o \n", 15); // 8진수
		System.out.printf("%b \n", 15); // boolean 
		System.out.printf("%s \n", Integer.toBinaryString(15)); // 2진수 변환 : 문자열 변경
		// %s : 문자열로 출력
		// %c : 문자로 출력
		
		// [%5d]%n, 10 : // [   10]
		// [%-5d]%n, 10 : // [10   ]
		// [%05d]%n, 10 : // [00010]
	}

}
