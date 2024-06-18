package p0618;

import java.util.Scanner;

public class C0618_10 {

	public static void main(String[] args) {
		// 1~100까지 랜덤 숫자를 생성해서, 랜덤숫자를 맞추는 프로그램을 구현하시오.
		// 숫자를 입력해서 
		// 입력한 숫자보다 랜덤숫자가 더 크면, 큰 수를 입력하세요.
		// 입력한 숫자보다 랜덤숫자가 더 작으면, 작은 수를 입력하세요. 를 출력
		// 10번까지만 입력가능하도록 구현. 정답을 맞추면 종료. 
		// 마지막에는 아래와 같이 출력 
		// 랜덤숫자 : ############
		// 입력한 숫자 :  ##########
		
		Scanner scan = new Scanner(System.in);
		int r_num = (int)(Math.random()*100)+1; // 1~100
		
		// for문(m)
//		int num = 0;
//		
//		for (int i=0;i<10;i++) {
//			System.out.println("1~100까지의 숫자 중 하나를 입력하세요. >> ");
//			num = scan.nextInt();
//			if (r_num<1 || r_num>100) {
//				System.out.println("1~100까지의 숫자를 입력하세요.");
//				continue;
//			} else if (r_num>num) {
//				System.out.println("더 큰 수를 입력하세요.");
//			} else if (r_num<num) {
//				System.out.println("더 작은 수를 입력하세요.");			
//			} else if (r_num==num) {
//				System.out.println("정답입니다! 게임을 종료합니다.");
//				break;
//			} //else if			
//			// if
//		} //for
//		System.out.println("횟수를 모두 소진하셨습니다. 종료됩니다.");
//		System.out.println("랜덤 숫자 : "+r_num);
//		System.out.println("입력한 숫자 : "+num);
//		
		
		// while문(t)
		int[] input = new int[10];
		int count = 0;
		int num = 0;
		System.out.println("랜덤번호 : "+r_num);
		while(count<10) {
			System.out.printf("%d번째 숫자를 입력하세요. >> ",count+1);
			num = scan.nextInt();
			
			// 유효값 확인
			if(num<1 || num>100) {
				System.out.println("1~100까지 숫자를 입력하셔야 합니다. 다시 입력하세요.");
				continue;
			}
			
			input[count] = num; // 입력한 번호 저장
			count++;
			
			if (num>r_num) {
				System.out.println("입력한 숫자보다 작은 수를 입력하세요.");
			} else if(num<r_num) {
				System.out.println("입력한 숫자보다 큰 수를 입력하세요.");
			} else {
				System.out.println("정답입니다.");
				break;
			}
		} //while
		System.out.println("랜덤번호 : "+r_num);
		System.out.print("입력 번호 : ");
		for(int j=0;j<count;j++) {
			System.out.print(input[j]+" ");
		}
		System.out.println();
		
		
		// 정답을 못 맞췄을 때 가장 근사치의 값을 출력시켜 보세요.
		// (입력값 - 정답)의 절대값이 가장 작은 값 출력, 2개가 될 수 있음.
		// Math.abs(r_num-input[0]) : 절대값
		
		int arr_no = 0; // 저장 위치
		int temp = 0; // 저장 값
		
		if (count == 10) {
			int[] no = new int[10]; // 배열생성
			for (int i=0;i<10;i++) { //랜덤값 입력한 값을 빼줌.
//				if(i==0) temp = Math.abs(r_num - input[i]);
//				if(temp>Math.abs(r_num - input[i]))
				no[i] = Math.abs(r_num - input[i]);
			} // for
			// 근사치값 : 43 42 41 40 39 38 37 1 1 2  일때
			
			arr_no = 0;
			temp = no[0];
			for(int i=1; i<10; i++) {
//				if (i == 0) {					
//					if (no[0]>=no[i]) { // 43>=42 
//						arr_no = i; // 1
//						temp = no[i]; // 42
//					} else {
//						arr_no = 0;
//						temp = no[0];
//					} // else
//					continue;
//				} // if
				if (temp>= no[i]) {
					arr_no = i;
					temp = no[i];
				}
			} // for
			
			System.out.println("근사치 값 1개 : "+input[arr_no]);
			
			System.out.print("근사치 값: ");
			for(int i=0; i<10; i++) {
				System.out.print(no[i]+" ");
			} // for
			System.out.println();
		} // if
		
//		System.out.println("횟수를 모두 소진하셨습니다. 종료됩니다.");
//		System.out.println("랜덤번호 : "+r_num);
//		System.out.print("입력 번호 : ");
//		int[] dif = new int [10];
//		int min = dif[0];
//		for(int j=0;j<i;j++) {
//			System.out.print(input[j]+" ");
//			for (int k=0; k<dif.length;k++) {
//				dif[k] = (input[j]-r_num)*(input[j]-r_num)/(input[j]-r_num);
//				if (dif[k]<min) {
//					min = dif[k];
//				} // if			
//			} // for
//		} // for (m)
		
		
//		System.out.println();
//		System.out.printf("입력한 숫자 중에 가장 인접한 숫자는 '%d'입니다.", dif);
//		System.out.println();		
		
		
		
		
		
		
		
		
	} // main

} // class
