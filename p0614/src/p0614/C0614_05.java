package p0614;

public class C0614_05 {

	public static void main(String[] args) {
		
		
		
		
		
		// 오버플로우 (Overflow)
		byte b = 127;
//		byte b2 = 128; // 에러 
//		b = b+1; // 에러
		// b = (byte) (b+1); // -128
		b = (byte) (b+10); // -119
		System.out.println(b); // 오버플로우 발생
		
		int num = 2147483647;
		num = num+1;
		System.out.println(num); // -2147483647
				
		
		/*
		char ch = 'A';
//		char ch2 = " "; // " " 사용하면 에러
//		char ch3 = 'AA'; // 문자 2개 이상 사용 시 error
		char ch4 = ' '; // 사이 띄우기 가능
//		char ch 5 = null; // null 안됨
		
		// String은 모두 가능
		String str = "AA";
		String str2 = "";
		String str3 = null; 
		
		String s1 = "A"+"B";
		System.out.println(s1); // AB
		// 문자열+어떤 타입 = 문자열타입으로 변경
		System.out.println(""+7+7+7); // 777 ==> 문자+숫자의 경우 문자열로 타입이 변환되어 출력
		System.out.println(7+7+7+""); // 21 ==> 출력은 숫자지만 타입은 문자
		System.out.println(7+7+7+""+7); //217 ==> 이백십칠이 아니라 이일칠로 읽어. 문자열 타입 
		*/

		
	
		
		

	}

}
