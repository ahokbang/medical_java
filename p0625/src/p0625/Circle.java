package p0625;

public class Circle extends Shape {
	
	Point center; // 중심축
	int r; // 원의 반지름
	
	Circle() { this(new Point(0,0), 100); } // 데이터가 안 들어오면 0,0에 반지름이 100인 원을 그리시오라는 의미
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
		
	}
}
