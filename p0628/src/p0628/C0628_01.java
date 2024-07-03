package p0628;

public class C0628_01 {
	// 

	public static void main(String[] args) {
//		int a = 0;
		String a = "0";
		for (int i=0; i<5; i++) {
			a += 1;
		} // for
		System.out.println(a);
		
		// char ch = ''; // 에러
		char ch = ' '; // 가능
		String str = ""; // 가능
		String str2 = " "; // 가능 
	} // main

} // class
