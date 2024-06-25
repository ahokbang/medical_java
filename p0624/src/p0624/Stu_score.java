package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stu_score {
	// 생성자, this, 초기화블럭
	
	{ // 초기화블럭
		count ++; 
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		this.stuNo = "S"+sdf.format(d)+String.format("%04d", count);
		// S20240001, S20240002, ...
		// S240001, S240002, ...
		
	}
	
	
	// 기본 생성자 호출 : 정의가 안되어면 java가 자동으로 생성해줌. 
	Stu_score() {}
	
	// 매개변수 생성자
//	Stu_score(int k, int e, int m){
//		kor = k;
//		eng = e;
//		math = m;
//		total = k+e+m;
//		avg = total/3.0;

	// 매개변수 생성자
	// this는 참조변수를 가리킨다.
//	Stu_score(String stuNo, String name, int kor, int eng, int math){
//		this.stuNo = stuNo;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		total = kor+eng+math;
//		avg = total/3.0;
//	} // 
	
	// 매개변수 생성자, stuNo 초기화블럭 선언으로 삭제함.
	Stu_score(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avg = total/3.0;
	} // 
	
	static int count; // 클래스변수 : 모든 객체가 공통으로 사용 
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
}
