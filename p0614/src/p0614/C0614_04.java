package p0614;

public class C0614_04 {

// java에서는 package, class는 무조건 있어야 해.
	
	
	// int num; // class 내 변수(인스턴스 변수): 자동으로 초기화 됨
	static int num; // static 넣으면 main method 내에서 사용 가능 
	
	// 무조건 main method가 package 안에 있어야  실행 돼
	// 메소드 내에서는 무조건 변수값을 초기화를 해야 함.
	public static void main(String[] args) {
		int score = 0; // 자동으로 초기화되지 않음. 그래서 무조건 초기화를 해야 함.
		System.out.println(score); // score 초기화해주지 않으면 에러
//		System.out.println(num); // error
		System.out.println(num); // 클래스 변수는 초기화 해주지 않아도 됨. 클래스 태 변수에 static 추가 후 출력 가능
		
	}

}
