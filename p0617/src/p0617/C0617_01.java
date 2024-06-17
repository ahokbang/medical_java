package p0617;

public class C0617_01 {

	public static void main(String[] args) {
		// print()
		System.out.println(7+7+""); // 14(문자열)
		System.out.println(""+7+7); // 77(문자열)
		
		char ch = 'a';
		System.out.println(ch); // a
		
		int num2 = 98;
		ch = (char)num2; // ch=num2하면 에러. num2 앞에 (char) 붙여줘야 해
		System.out.println(ch); // b
		
		int num = 'a'; // int가 char보다 크므로 int==> 아스키코드
		System.out.println(num); // 97

	}

}
