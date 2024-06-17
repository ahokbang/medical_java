package p0617;

import java.util.Scanner;

public class C0617_03 {

	public static void main(String[] args) {
		// scanner
		Scanner scan = new Scanner(System.in); // System(console창) 화면에 받겠다.
		// java.util.Scanner scan = new Scanner(System.in); 이라고 쓰면 위에 import java.util.Scanner; 안써줘도 돼.
		
		// python에서는 input("데이터를 입력하세요.");
		
		System.out.println("데이터를 입력하세요.");
		String input = scan.next();
		System.out.println("숫자를 입력하세요.");
		System.out.println("입력한 데이터 : %s"+input);
		int num = scan.nextInt();
		System.out.println("입력한 데이터 : %s, 입력한 숫자 : %d \n"+input+num);
		System.out.println("입력한 데이터 : "+input+","+"입력한 숫자 : "+num);

	}

}
