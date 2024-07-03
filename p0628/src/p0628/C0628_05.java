package p0628;

public class C0628_05 {

	public static void main(String[] args) {
		String str = "123";
		str = str+"12";
		System.out.println(str); // 12312
		
		// [StringBuffer]
//		StringBufer sb = "123"; // 에러
		StringBuffer sb = new StringBuffer("123");
//		sb = sb + "12"; // 에러
		sb.append("12"); // "123"+"12"
		System.out.println(sb); // 12312
		
		
		int a = 10;
		int b = 5;
		int c  = 100;
		Math.max(a, b); // 두 숫자만 비교 가능
//		Math.max(a, b, c); // 세 숫자는 아래와 같이 비교
		Math.max(Math.max(a, b), c); // 세 숫자는 아래와 같이 비교
		
	}

}
