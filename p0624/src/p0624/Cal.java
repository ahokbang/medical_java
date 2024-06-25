package p0624;

public class Cal {
	
	// 인스턴스 메소드
	int add(int a, int b, int c) {
		int result = a + b + c;
		return result;		
	} // add, 매개변수 : a, b, c
	
	int add2(int[] num) {
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		} // for
		return sum;
//		return num[0]+num[1]+num[2];
	} // add2
	
} // class 
