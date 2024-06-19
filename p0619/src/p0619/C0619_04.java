package p0619;

import java.util.Scanner;

public class C0619_04 {

	public static void main(String[] args) {
		// Quiz
		// 5,5 배열 생성해서 1,1,1,1,1, 나머지는 0으로 채워서 랜덤으로 섞어 출력하시오.
		
		// 1. [번호 확인 배열] : 번호 넣기		
		int[][] arr = new int[5][5];
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[0][3] = 1;
		arr[0][4] = 1;
		
		// 1-2. 번호 섞기
		int no =0;
		int no2= 0;
		int t_value = 0;
		for (int i=0;i<300;i++) {
			no = (int)(Math.random()*5);
			no2 = (int)(Math.random()*5);
			t_value = arr[0][0];
			arr[0][0]=arr[no][no2];
			arr[no][no2]=t_value;
		}
		
		// 2. 번호 맞추기 화면 : 번호 넣기
		String[][] lotto = new String[5][5];
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				lotto[i][j] = "♥";
			}
		}
		
		while(true) {
	
		// 3. 번호 출력
		System.out.println("                [ 좌 표 ] ");
		System.out.println("   |\t0\t1\t2\t3\t4\t");
		System.out.println("------------------------------------------");
		
		for(int i=0;i<5;i++) {
			System.out.print(i+"  |\t");
			for(int j=0;j<5;j++) {
				System.out.printf("%s\t",lotto[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 4. 번호 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("가로 좌표를 입력하세요. >> ");
		int x = scan.nextInt();
		System.out.println("세로 좌표를 입력하세요. >> ");
		int y = scan.nextInt();
		
		// 7. x,y 좌표값 입력 시 0~4가 아닌 수를 입력했을 경우 알림 메시지 출력하시오.
		if (((x<0 || x>4) || (y<0|| y>4))) {
			System.out.println("좌표 범위를 벗어났습니다. 0~4 사이의 값을 입력해주세요.");
			continue;
		}
		
		// 6. 이미 확인한 좌표르 입력했을 때 알림 문구 발생시키기
		// 입력받은 좌표값이 확인이 된 좌표인지 체크 : String
		// 확인이 된 좌표입니다.라고 출력이 되고 다시 입력 받게끔 해주세요.
		if (lotto[x][y].equals("꽝") || lotto[x][y].equals("당첨")) {
			System.out.println("확인된 좌표입니다. 다시 입력하세요.");
			continue;
		}
					
		// 5. arr 배열에서 x,y 좌표의 값 비교
		// 1 : 당첨, 0 : 꽝 출력
		if (arr[x][y] == 1) {
			lotto[x][y] = "당첨";
		} else {
			lotto[x][y] = "꽝";
		} // else
		
		// 8. 5개를 모두 찾으면 프로그램 종료
		
//			System.out.println("프로그램을 종료합니다.");
//			break;
//		}
		
		
		} // while
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 3. 1번 번호 랜덤 출력		
//		System.out.println("               [ 좌 표 ] ");
//		System.out.println("   |\t0\t1\t2\t3\t4\t");
//		System.out.println("------------------------");
//		
//		for(int i=0;i<5;i++) {
//			System.out.print(i+"  |\t");
//			for(int j=0;j<5;j++) {
//				System.out.printf("%d\t",arr[i][j]);
//			}
//			System.out.println();
//		}
		
//		
//		int[][] arr = new int[5][5];
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<5;j++) {
//				arr[i][j] = 0;
//			}
//		}
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.println(arr[i][j]);
//			}
//		}
//		
//		int no =0;
//		int no2= 0;
//		int t_value = 1;
//		for (int i=0;i<300;i++) {
//			no = (int)(Math.random()*25);
//			t_value = arr[0][0];
//			arr[0][0]=arr[no][no2];
//			arr[no][no2]=t_value;
//		}
//		
//		
//	for(int i=0;i<5;i++) {
//		for(int j=0;j<5;j++) {
//			System.out.println(arr[i][j]);
//		}
//	}

	}

}
