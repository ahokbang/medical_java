package p0624;

public class C0624_10 {

	public static void main(String[] args) {
		// 생성자
		

		Stu_score s = new Stu_score();
		s.stuNo = "S0001";
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 99;
		s.math = 87;
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3.0;
		
		
		// 매개변수가 있는 생성자 사용
		Stu_score s2 = new Stu_score("유관순",100,88,85);
						
		Stu_score s3 = new Stu_score();
		s3=s2; // 얕은복사 : 주소값만 복사
		s3.kor = 10;
		
		System.out.println(s2.kor);
	}

}


/* 변수의 초기화
 * - 변수를 선언하고 처음으로 값을 저장하는 것
 * - 멤버변수(인스턴스변수, 클래스변수)와 배열은 각 타입의 기본값으로 자동초기화되므로 초기화 생략 가능
 * - 지역변수는 사용 전에 꼭!!! 초기화를 해주어야 한다. 자동으로 초기화되지 않음.    
 * 
 * [멤버변수의 초기화]
 * 명시적 초기화
 * - 
 * */
 