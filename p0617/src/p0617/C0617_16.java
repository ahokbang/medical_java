package p0617;

import java.util.Scanner;

public class C0617_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 구구단 출력 시 2-9단까지 출력하는데 홀수단(3, 5, 7, 9단)만 출력하시오.
		for (int i=2;i<=9;i++) {
				System.out.println("[ "+i+"단 ]");
			for (int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
				}
			}
		}
			
		
		
		// 1~10까지의 합을 출력하시오.
//		int sum = 0;
//		int i = 0;
//		for (i=1;i<=10;i++) {
//			sum += i;
//			}
//		System.out.println(i+"까지의 합 : "+sum);
//		System.out.println((i-1)+"까지의 합 : "+sum);
//		}
		
		
		// 1~100까지 합을 구하는데, sum이 150을 넘었을 때 i와 sum값을 출력하시오.
//		int sum = 0;
//		for (int i=1;i<=100;i++) {
//			sum = sum + i;
//			if (sum>150) {
//				System.out.println("i : "+i); // i-1 해줘야 해.
//				break;
//			}
//		} // mc
//		System.out.println("sum : "+sum);
		
//		int sum2 = 0;
//		int i = 0;
//		for (i=1;i<=100;i++) {
//			sum2 = sum2 + i;
//			if (sum2>150) break;
//			}
//		System.out.println("[tc] i : "+(i-1));
//		System.out.println("sum : "+sum2); //tc 
//		}
//		
//		
		// 구구단 중첩 for문 사용
//		for (int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단]\n",i);
//			for (int j=1;j<=9;j++) {
////				System.out.println(i+"*"+j+"="+i*j);
////				System.out.printf(i+"*"+j+"="+i*j+"\n");
//				System.out.printf(i+"*"+j+"="+i*j+"\t");
////				System.out.printf("%d * %d = %d \n", i, j, i*j);
////				System.out.printf("%d * %d = %d \t", i, j, i*j);
//			}
//			System.out.println("\n");
//		}		
		
		// 10번 입력 받을 때마다 합계를 출력하시오.
		// 5 -> 5, 10 -> 15, 10번을 출력하시오.
//		int sum = 0;
//		for (int i=1; i<=10; i++ ) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			sum = sum + num;
//			System.out.println(sum);
//		}
//		System.out.println("총 합계 : "+sum);
		
		// 1~100까지 숫자 더해서 출력하시오.		
//		int sum2 = 0;
//		for (int i=1;i<=100;i++) {
//			sum2 = sum2+i;
//		}
//		System.out.println("\n");
//		System.out.println(sum2);
//
//		// 1~100까지 홀수만 더해서 최종값을 출력하시오.
//		// mc
//		int sum3 = 0;
//		for (int i=1;i<=100;i++) {
//			i = i+2;
//			sum3 = sum3+i;
//		}
//		System.out.println(sum3);
//		
//		// tc
//		int sum4 = 0;
//		for (int i=1;i<=100;i++) {			
//			if(i%2!=0) sum4 = sum4+i;
//		}
//		System.out.println(sum4);
//		//또는
//		int sum5 =0;
//		for (int i=1;i<=100; i+=2) {
//			sum5 = sum5+i;
//		}
//		System.out.println(sum5);
//		

		
		// for문
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			sum = sum + i;
//			System.out.println("i : "+i);
//			System.out.println("sum : "+sum);
//		}
//		System.out.println("최종 sum : "+sum);
		
		/*
		[ for문 ]
			for(초기화; 조건식; 증감식){
			}
			
			1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 ...
			1. 초기화  
			2. 조건식
			3. 수행될 문장
			4. 증감식
		 * */
		
//	}

}
