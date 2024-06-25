package p0624;

import java.util.Arrays;

public class C0624_02 {

	public static void main(String[] args) {
		// 메소드
		
		int[] arr1 = new int[3];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		System.out.println("arr1 : "+Arrays.toString(arr1));
		
		int[] arr2 = null; // 참조변수만 선언
		arr2 = arr1; // 주소값만 복사. 공간만 넘겨줘
		System.out.println("arr2 : "+Arrays.toString(arr2));
		arr2[0] = 1000;
		System.out.println("arr2 : "+Arrays.toString(arr2));
		System.out.println("arr1 : "+Arrays.toString(arr1)); // arr1[0]의 값도 같이 바뀜
		
		

	}

}
