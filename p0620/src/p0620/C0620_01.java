package p0620;

import java.util.Arrays;
import java.util.Scanner;

public class C0620_01 {

	public static void main(String[] args) {
		// lotto, 학생성적프로그램은 안보고 할 수 있을 정도로 익히기!
		
		// 배열
		Scanner scan = new Scanner(System.in);
		
		// 2차원 배열 
		// 입력 받은 숫자의 자리에 x 표시하기 ==> 먼저 int를 string으로 변환해야 해. 숫자들은 int에 담겨있으니까 : int -> String 
		
		
		// 배열 생성 및 숫자 입력
//		int[][] arr = new int[5][5];
		String[][] arr = new String[5][5];
		// 1~25까지 숫자를 넣고 배열 섞기 후 for문으로 출력
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				arr[i][j] = 5*i+(j+1)+"";
			}
		}
		
		// 숫자 섞기
		int no = 0;
		int no2 = 0;
//		int t_value = 0;
		String t_value = "";
		for (int i=0; i<5; i++) {
			no = (int)(Math.random()*5);
			no2 = (int)(Math.random()*5);					
			t_value = arr[0][0];
			arr[0][0] = arr[no][no2];
			arr[no][no2] = t_value;
		}
		

		int count = 0; // 번호 입력 횟수
		
		// 2차원 배열 출력
		while(true) {		
			// 2차원 배열 출력
			System.out.println("          [ 2차원 배열 출력 ]");
			System.out.println("--------------------------------------------");
			for (int i=0; i<5; i++) {
				for (int j=0; j<5; j++) {
					System.out.print(arr[i][j]+"\t");
				}
			System.out.println();
			}
			System.out.println("--------------------------------------------");
			
			if (count == 25) {
				System.out.println("25번의 X표시가 완료되었습니다.");
				System.out.println("[ 프로그램 종료 ]");
				break;
			}			
			
			// 숫자 입력 받기 
			System.out.println("1~25 중에 있는 숫자 1개를 입력하세요. >> ");
			int input = scan.nextInt();
			// 입력한 숫자가 1~25를 벗어나면 잘못입력했습니다. 다시 입력하세요. 출력
			if (input<0 || input>25) {
				System.out.println("입력한 숫자가 1~25를 벗어났습니다. 1~25 중 숫자 1개를 다시 입력하세요.");
				System.out.println();
				continue;
			}
			// 1~25까지의 숫자르 넣으면 X 표시되도록 구현하시오. : 2중 for문으로 싹 다 비교한 후 입력된 숫자를 X로 표시
			// 이미 입력한 숫자를 다시 입력했을 경우 알림 메시지 
			String input_str = input+""; 
			int temp = 0;
			for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length; j++) {
					if (arr[i][j].equals(input_str)) {
						arr[i][j] = "X";
						temp = 1;
						count ++; // 같은 숫자가 나왔을 때만 count 증가
					}
				}
			}
					
			if(temp==0) {
				System.out.printf("%s은/는 이미 입력했습니다. 다른 숫자를 입력하세요.", input_str);
				System.out.println();
			}
			
			for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length; j++) {
					
				}
			}
			
			
			
			System.out.println("입력한 숫자 : "+input);
			System.out.println();
				
			
			
			
			
		}
		
		
		
		
		
		
// 		1차원 배열, 기존 int 타입 배열 -> String으로 바꾸기		
//		int [] score = new int[45];
//		String [] score = new String[45];
//		for (int i=0; i<score.length; i++) {
//			score[i] = i+1;
//			score[i] = i+1+"";
//		}
//		System.out.println(Arrays.toString(score));

	} // main

} // class
