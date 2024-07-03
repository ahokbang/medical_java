package p0628;

import java.util.Scanner;

public class C0628_04 {
	// 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("찾고자 하는 문자열을 입력하세요. >> ");
		String search = scan.next();
		String str = "abcdeakabcdefga";
		System.out.println("해당 문자열 : "+str);

//		System.out.println(str); // abcdeakabcdefga
//		System.out.println(str.indexOf("a")); // 0
//		System.out.println("str : "+str.substring(1)); // bcdeakabcdefga
//		String str2 = str.substring(1);  
//		System.out.println("index : "+str2.indexOf("a")); // index : 4
//		System.out.println("str : "+ str2.substring(5)); // str : kabcdefga
//		String str3 = str2.substring(5);
//		System.out.println(str3.indexOf("a")); // 1
//		String str4 = str3.substring(2);
//		System.out.println(str4.indexOf("a")); // 6
		
		int count = 0;
		while (true) {
			int num = 0;
			num = str.indexOf(search);
			if (num == -1) {
				break; // 해당하는 문자열을 못 찾았을 때 -1 리턴, 프로그램 종료
			} else {
				count++;
				str = str.substring(num+1);
			} // if-else
			
		} // while
		
		System.out.printf("%s 찾는 문자열 개수 : %d \n", search, count);
		
	} // main

} //class
