package p0614;

public class C0614_03 {
	public static void main(String[] args) {
		
		// System.out.println();
		// sysout 작성하고 ctrl+spacebar 누르고 엔터하면 저절로 System.out.println 입력됨
		
		
		boolean power = true; // True로 작성하면 error
		char ch = 'A';
		
		System.out.println(ch); // A 
		// ctrl+F11 누르면 자동 실행
		
		char ch2 = '\u0041'; 
		System.out.println(ch2); // A 
		
		char ch3 = 'A';
		System.out.println(ch3); // A
		System.out.println((int)ch3); // 65 // 아스키코드 변환
		
		int a = 65;
		System.out.println(a); // 65
		// ctrl + alt + 아래방향키 : 복사
		System.out.println((char)a); // A // 아스키코드 변환
		
		/*아스키코드
		 a : 97
		 A : 65
		 0 : 48
		*/
		
		int hex = 0x100;
		System.out.println(hex); // 256 (16진수)
		
		int oct = 0100; // 8진수
		System.out.println(oct); // 64
		
		long l = 10000000000L; 
		float f = 3.14f;
		double d = 2.13;
		float f2 = 100f;
		
		/*
		10. -> 10.0, double(접미사 없으므로)
		.10 -> 0.10, double(접미사 없으므로)
		10f -> 10.0f, float(f접미사 있으므로)
		3.14e3f -> 3140.0f, float(f접미사 있으므로)
		1el -> 10.0(10의 1승이므로 10), 실수형, double(접미사 없으므로)
		 */
		 
		
		
				
		
	}

//	public static void main() {
//	// public : 접근제한자
//	// static : 
//	// void : 
//	// main() : method
//	}
}
