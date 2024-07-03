package p0628;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {

	static int count = 0;
	
	{// 초기화블럭
		count++;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		// S24001
		this.stuNo = "S"+sdf.format(d)+String.format("%03d",count);
	}
	
	Students(){}// 기본생성자
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Students.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	Students(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	
	String getStuNo() {
		return stuNo;
	}
	
	void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	
	
	@Override
	public String toString() {
//		return stuNo;
		return String.format("%s, %s. %d. %.2f", stuNo, name, total, avg);
	}
	
	
	
	
} // class
