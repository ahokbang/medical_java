package p0625;

import java.util.*;
//import java.util.Date; // 1
//import java.util.Scanner;

public class C0625_03 {

	public static void main(String[] args) {
		// 
		
		Date d = new Date(); 
		// 1을 안 쓰고 싶다면, 아래와 같이 써야 해.
//		java.util.Date d = new java.util.Date();
		java.sql.Date dd = new java.sql.Date(0); 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("안녕"); // import 생략 가능 - java.lang
		

	}

}
