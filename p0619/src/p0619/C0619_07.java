package p0619;

import java.util.Scanner;

import javax.swing.JOptionPane; // window창으로 메세지 입력; 요즘엔 잘 안씀. 참고로 알아두기


public class C0619_07 {

	public static void main(String[] args) {
		// 번호 맞추기
		// -1 누르면 프로그램 종료
		
		Scanner scan = new Scanner(System.in);
		
		int num = (int)(Math.random()*100)+1;
		int input = 0; // 입력 받을 값
		int count = 0; // 도전 횟수
		
		while (true) {
//			System.out.println("숫자를 입력하세요. >> ");
//			input = scan.nextInt();
			String str = JOptionPane.showInputDialog("숫자를 입력하세요(-1: 종료).");
			count++;
			
			input = Integer.parseInt(str);
			
			if (input == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} // if(프로그램 종료) 
			
			if(num>input) {
				System.out.println("더 큰 수를 입력하세요.");				
			}else if (num<input){
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("정답입니다."+num);
				break;
			} // else
			
		} //while
	}

}
