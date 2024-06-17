package p0617;

import java.util.Scanner;

public class C0617_14 {

	public static void main(String[] args) {
		// 성적처리 프로그램
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 성적처리 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 학생검색");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt(); 

		switch(choice) {
		case 1 :
			System.out.println("성적입력이 실행됩니다.");
			break;
		case 2 :
			System.out.println("성적출력이 실행됩니다.");
			break;
		case 3 :
			System.out.println("성적수정이 실행됩니다.");
			break;
		case 4 :
			System.out.println("성적삭제가 실행됩니다.");
			break;
		case 5 :
			System.out.println("학생검색이 실행됩니다.");
			break;
		default : // 넣어도 되고 안 넣어도 돼.
			System.out.println("번호를 잘못 눌렀습니다.");
		break;
		}
	}

}
