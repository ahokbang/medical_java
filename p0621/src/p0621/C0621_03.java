package p0621;

import java.util.Scanner;

public class C0621_03 {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		
		// 객체 선언
		Cal cal = new Cal();
		int result = cal.add(10,5);
		System.out.println("result : "+result);
		
		
//		// 객체 선언
//		C0621_03 c = new C0621_03();
//		// 참조변수명.메소드명
//		int result = c.add(10,5); // 
//		System.err.println(result);
//		
	} // main

	// 메소드 선언
	// 리턴타입과 return 결과값은 타입이 같아야 함.
	int add(int a, int b) {
		int result = a + b;
//		double result = a + b; // double일 경우 return과 타입이 달라서 에러 발생
		return result; // 2개 될 수 없음. return은 1개
	}
	
	void add1 (int a, int b) {
		System.out.println(a+b);
	} // 리턴타입이 void이면 return이 필요 없음.
	
} // class

/*메서드 (파이썬의 함수와 같은 말)
 * 메서드란 ?
   - 작업을 수행하기 위한 명령문의 집합
   - 어떤 값을 입력 받아서 처리하고 그 결과를 돌려준다. 
 *   (입력 받는 값이 없을 수도 있고 결과를 돌려주지 않을 수도 있다.)
 *  
 *  메서드의 장점과 작성 지침
    - 반복적인 코드를 줄이고 코드의 관리 용이
    - 반복적으로 수행되는 
    - 하나의 메서드는 한 가
    - 관련된 여러 문장을 메서드로 작성
    
 * 메서드를 정의하는 방법 : 클래스 영역에만 정의할 수 있음.
  리턴타입 메서드이름 (타입 변수명, 타입 변수명, ...)    - 선언부
  {      
  				
  				// 메서드 호출 시 수행될 코드       - 구현부
  
  } 
  
  예)
  int add (int a, int b) - 선언부
  {
  	int result = a + b;
  	return result;       - 구현부
  	// 호출한 메서드로 결과를 반환한다. 
  }
  
  
  void power() {          // 반환값이 없는 경우 리턴타입 대신 void 사용
  	power = !power;
  }
  
  
  
  * [리턴문]
  * 메서드가 정상적으로 종료되는 경우
    - 메서드의 블럭{}의 끝에 도달했을 때
    - 메서드의 블럭{}을 수행 도중 return문을 만났을 때
  * return 문
    - 현재 실행 중인 메서드를 종료하고 호출한 메서드로 되돌아간다.
    1. 반환값이 없는 경우 : return문만 써주면 된다. 
    			return;
	2. 반환값이 있는 경우 : 
	
	
* [주의사항]
* 반환값이 있는 메서드는 모든 경우에 return문이 있어야 한다.
 	int max(int a, int b) {
 		if (a>b)
 			return a;
 		else 
 			return b; 	
 	}
 	
*  return문의 개수는 최소화 하는 것이 좋다. 

* [메서드의 호출]
* 메서드의 호출 방법
  참조변수.메서드 이름(); // 메서드에 선언된 매개변수가 없는 경우
  참조변수.메서드 이름(값1, 값2, ...); // 메서드에 선언된 매개변수가 있는 경우
* 
    
 * */