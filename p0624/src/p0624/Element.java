package p0624;

public class Element {

	void allCal(int a, int b, int[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
	}
	
	
	
	
//	int result = 0;
//	 void cal(int a, int b) {
//		System.out.println("더하기 : "+(a+b));
//		System.out.println("빼기 : "+(a-b));
//		System.out.println("곱하기 : "+(a*b));
//		System.out.println("나누기 : "+(a/b));	
//	} // cal m
	
	int cal(int a, int b) {
		return a+b;
	}  // cal t
	int cal2(int a, int b) {
		return a-b;
	}  // cal2 t
	int cal3(int a, int b) {
		return a*b;
	}  // cal3 t
	int cal4(int a, int b) {
		return a/b;
	}  // cal4 t
	
} // clss
