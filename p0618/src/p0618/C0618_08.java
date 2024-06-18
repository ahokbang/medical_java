package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_08 {

	public static void main(String[] args) {
		// 배열
		
		// 로또번호 생성, 섞기, 6개의 숫자 출력 
		
		// 1. 1-45 생성하기
		int [] ball = new int [45];
		int [] myArr = new int [6]; // my
		int [] myLotto = new int [6]; // 당첨번호
		
		// 2. 1-45 입력하기
		for (int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		} // for
		
		// 3. 로또번호 랜덤 섞기
		int no =0;
		int t_value = 0;
		for (int i=0; i<1000; i++) {
			no = (int)(Math.random()*45); 			
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		} // for
		
		// -------------------------------------
		// 5. 로또 번호 출력
		System.out.print("로또 번호 : ");
		for (int i=0;i<6;i++) {
			System.out.print(ball[i]+" ");
		} // for
		System.out.println();
		// -------------------------------------
		
		// 4. my로또번호 입력(myArr 생성하기)
//		int [] myArr = new int [6];
//		Scanner scan = new Scanner(System.in);
//		for (int i=0;i<6;i++) {
//			System.out.println("1~45 중에서 숫자를 입력하세요. >> ");
//			myArr[i] = scan.nextInt();
//		} // for
		
		// 4. my로또번호 입력(myArr 생성하기) : 1~45 외에 숫자를 입력했을 경우 추가
//		int [] myArr = new int [6];
//		int num = 0;
//		Scanner scan = new Scanner(System.in);
//		for (int i=0;i<6;i++) {
//			System.out.println("1~45 중에서 숫자를 입력하세요. >> ");
//			num = scan.nextInt();
//			if (num<1 || num >45) {
//				System.out.println("1~45까지의 숫자만 입력하셔야 합니다. 다시 입력해주세요.");
//				continue;
//			} // if
//			myArr[i] = num;
//		} // for
		
		// 4. my로또번호 입력(myArr 생성하기) : 1~45 외에 숫자를 입력했을 경우 에러 발생 ==> for-> while 변경
		Scanner scan = new Scanner(System.in);
//		int [] myArr = new int [6]; // m
		int num = 0;
		int n = 0;
		while (n<6) {
			System.out.printf("1~45 중에서 %d번째 숫자를 입력하세요. >> ", n+1);
			num = scan.nextInt();
			if (num<1 || num >45) {
				System.out.println("1~45까지의 숫자만 입력하셔야 합니다. 다시 입력해주세요.");
				continue;
			} // if
			myArr[n] = num;
			n++;
		} // for
		
		// 입력한 숫자 출력
		System.out.print("입력한 숫자 : ");
		for (int i=0;i<myArr.length;i++) {
			System.out.print(myArr[i]+" ");
		} // for
		
		System.out.println();
		
		// 로또 번호와 일치하는 번호 확인 : myArr, ball
		int count = 0;
//		int [] lotto = new int[6]; //m
		
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				// 당첨된 번호가 출력되도록 구현하시오.
				if(myArr[i] == ball[j]) {
					myLotto[count] = myArr[i];
					count ++;
//					lotto[i] = myArr[i]; // m
					break;
				} // if
			} // j for
		} // for
		
		
		System.out.println("로또 당첨 개수 : "+count);
		
		// 당첨 번호 
//		for (int i=0; i<lotto.length;i++) {
//			System.out.println("당첨 번호 : "+Arrays.toString(lotto));
//			if (lotto[i]==0) continue;
//			System.out.println("당첨 번호 : "+lotto[i]);					
//		} // for //m 
		
		System.out.print("당첨된 번호 : ");
		for(int i=0; i<count;i++) { 
			System.out.print(myLotto[i]+" ");
		} // for
		if (count==0) System.out.print("당첨된 번호가 없습니다."); // count는 for문이 다 끝나야 알 수있으므로 for문 밖에 있어야 해
		
		System.out.println();
		
		// 당첨 금액 
		   // 6개 : 100억원
		   // 5개 : 1억원
		   // 4개 : 1백만원
		   // 3개 : 1만원
		
		switch (count) {
		case 6: 
			System.out.println("당첨금액은 100억원입니다.");
			break;
		case 5:
			System.out.println("당첨금액은 1억원입니다.");
			break;
		case 4:
			System.out.println("당첨금액은 1백만원입니다.");
			break;
		case 3:
			System.out.println("당첨금액은 1만원입니다.");
			break;	
		default :
			System.out.println("당첨금액이 없습니다.");
			break;
		} // switch
		
		
		
		
		
		
		// C0618_07 추가 보완 설명
//		// 로또번호 생성
//		// 1~45 숫자 중에서 6개 뽑아야 함.
//		for (int i=0; i<6;i++) {
//			System.out.println((int)(Math.random()*45)); // 같은 번호가 출력 될 수 있어.
//		} //for
//		
//		// 1~45를 생성 및 랜덤하게 배열한 후 앞에 6글자를 가져오면 중복되지 않아. 

	} // main

} // class
