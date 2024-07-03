package p0627;

public class C0627_03 {

	public static void main(String[] args) {
		// 예외처리, try-catch
		
		System.out.println(1);
		System.out.println(2);
		
		try { // 예외가 발생 될 것 같은 경우
			System.out.println(3);
			System.out.println(4);
			
		} catch(Exception e) {
			System.out.println(5);
			
		}
		
		System.out.println(6);
		
		// 1, 2, 3, 4, 6 : try 내에서 예외 발생하지 않아 catch 실행되지 않음.
		System.out.println("------------------------");
		
		System.out.println(1);
		System.out.println(2);
		
		try { // 예외가 발생 될 것 같은 경우
			System.out.println(3);
			System.out.println(0/0); // 에러
			System.out.println(4);
			
		} catch(Exception e) {
			System.out.println(5);
			
		}
		
		System.out.println(6);
		
		// 1, 2, 3, 5, 6 : try 내 3 이후에 에러(0/0) 발생하여 4가 실행되지 않고 바로 catch 실행됨.
		
		// 만약 try-catch 밖에서 에러 발생하면 프로그램이 종료됨.
		
		
		System.out.println("------------------------");
		
		System.out.println(1);
		System.out.println(2);
		
		try { // 예외가 발생 될 것 같은 경우
			System.out.println(3);
			System.out.println(0/0); // 에러
			System.out.println(4);
			
		} catch(Exception e) {
			System.out.println(5);
			e.printStackTrace(); // 어떤 에러가 났는지 알려줌. 
			
		}
		
		System.out.println(6);
		
		
		
	} // main

} // class
