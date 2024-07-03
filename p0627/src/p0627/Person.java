package p0627;

public class Person {

	long id;
	
	Person() {}
	Person(long id){
		this.id = id;		
	} // Person
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
//			Person p = (Person) obj;
//			if (id == p.id) return true; 또는 if(id == ((Person)obj).id) return ture;
//			else return false; // 한줄이니까 중괄호 생략 가능						
//			return id == p.id; // 위의 5줄을 이 한 줄로 쓸 수 있어. 
			return id == ((Person)obj).id; // 위의 줄을 이렇게 쓸 수 있어. 
		}else {
			return false;
		} // if-else
//		return super.equals(obj);
	} // equals
	
	@Override
	public String toString() {		
//		return super.toString();
		return "주민번호 : "+id;
	} // toSting
	

	
} // class
