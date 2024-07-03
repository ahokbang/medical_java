package p0628;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C0628_08 {
// 

	public static void main(String[] args) {
		
		
		Process p = new Process();
		// list, list2의 값을 모두 출력하시오. 
		//  list
		HashMap<String, Object> map = p.read_con();
		Object obj = map.get("list");
		ArrayList list = (ArrayList)obj;
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		// list 2 
		Object obj2 = map.get("list2");
		ArrayList list2 = (ArrayList)obj2;
		for (int i=0;i<list.size();i++) {
			System.out.println(list2.get(i));
		}
		System.out.println();		
		
		// set을 출력하시오. 
		Object obj3 = map.get("set");
		HashSet set = (HashSet)obj3;				
		Iterator it = set.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
//		HashMap map = new HashMap();
//		map.put("aaa", 1111);
//		map.put("bbb", 1234);
//		map.put("aaa", 1111);
//		map.put("aaa", 1111);
//		
//		String str = "bbb";
//		
//		if(map.containsKey(str)) {
//			System.out.println("동일한 데이터가 있습니다.");		
//		} else {
//			System.out.println("일치하는 데이터가 없습니다. ");
//		} // if-else
//		
//		System.out.println();
//		
//		// map에는 iterator() 없음.
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
//		HashSet set = new HashSet();
//		
////		set.add("abc"); // 아래와 주소값이 같음
////		set.add("abc");	// 위와 주소값이 같음
//		set.add(new Person("홍길동", 1)); // 값은 같으나 주소가 달라
//		set.add(new Person("심봉사", 2));
//		set.add(new Person("심청이", 3));
//		set.add(new Person("이몽룡", 4));
//		set.add(new Person("성춘향", 5));
//		
//		System.out.println(set); // [abc, da:10, da:10] // 기본형으로 넣을 때는 중복 되지 않으나 객체로 넣을 때는 주소가 다르므로 다른 값으로 인식하고 출력함. 
//		
//		// Interator() : 순서없음, 1회용으로 2번 출력하려면 다시 선언해야 함.
//		Iterator it = set.iterator();
//		while(it.hasNext()) { // 현재 객체가 있는지 확인
//			Person p = (Person)it.next(); // 객체 1개 가져오기
//			System.out.println(p.name);
//		}
//		System.out.println();
//		
//		
//		it = set.iterator();
//		while(it.hasNext()) { // 현재 객체가 있는지 확인
//			Person p = (Person)it.next(); // 객체 1개 가져오기
//			System.out.println(p.name);
//		}
//		
//		System.out.println();
//		
//		ArrayList list = new ArrayList(); 
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		Iterator it2 = list.iterator();
//		while(it2.hasNext()) {
////			Object o = it2.next();
//			System.out.println(it2.next());
//			
//		}
				

//		HashSet set = new HashSet();
//		set.add(new Card(1,"SPADE"));
//		set.add(new Card(2,"DIAMOND"));
//		set.add(new Card(3,"HEART"));
//		set.add(new Card(4,"CLOVER"));
//		set.add(new Card(1,"SPADE"));
//		set.add(new Card(6,"SPADE"));
//		
//		System.out.println(set);
		
		
//		HashSet set = new HashSet();
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("3");
//		set.add("1");
//		set.add("1");
//		set.add("4");
//		
//		System.out.println(set); // 동일한 값을 출력하지 않음.
		
//		// int
//		Object[] objArr = {"1", 1, "2","2","3","3","4","4","4"};
//		Set set = new HashSet();
//		
//		for (int i=0; i<objArr.length; i++) {
//			set.add(objArr[i]);
//		}
//		
//		System.out.println(set); // [1, 1, 2, 3, 4] // 중복은 출력하지 않음.
	} // main 

} // class C0628_08



class Person { // class 앞에 public 작성하면 에러 발생함. public 다음에 오는 클래스는 무조건 파일이름과 동일해야 함.
	String name;
	int age;
	
	Person(){}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	@Override
	public String toString() {
		return name+":"+age;
	}
} // class Person
