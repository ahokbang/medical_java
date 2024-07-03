package p0628;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class C0628_06 {

	public static void main(String[] args) {
		
		// Vector
		Vector v = new Vector();
		
				
		ArrayList<Students> list = new ArrayList<Students>(); // 제너릭 : Card 외에는 못들오게 막음. 형변환 하지 않고 직접 출력 가능. 자동으로 형변환 해줌.
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("심봉사",99,99,99));
		list.add(new Students("심청이",80,80,59));
		list.add(new Students("성춘향",70,70,79));
		list.add(new Students("이몽룡",65,80,91));
		list.add(new Students("홍길동",100,100,99));
		// 위치값으로 삭제
		list.remove(0);
		
		for (int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		ArrayList list = new ArrayList();
//		// 제네릭
//		ArrayList<Card> list = new ArrayList<Card>(); // 제너릭 : Card 외에는 못들오게 막음. 형변환 하지 않고 직접 출력 가능. 자동으로 형변환 해줌.
//		list.add(new Card(1,"SPADE"));
//		list.add(new Card(2,"SPADE"));
//		list.add(new Card(2,"DIAMOND"));
//		list.add(new Card(3,"HEART"));
//		list.add(new Card(4,"CLOVER"));
////		list.add(new Students()); // 형변환 시 에러, number와 kind가 없어서
////		list.add("안녕"); // 형변환 시 에러, number와 kind가 없어서
//		
//		for(int i=0;i<list.size();i++) {
////			System.out.println(list.get(i)); // get의 타입은 Object, 주소값이 찍혀
////			Card c = (Card)list.get(i); // 제넉릭 했을 경우 자동을 형변환해줌.
////			System.out.println(c.number+","+c.kind);
//			System.out.println(list.get(i).number+","+list.get(i).kind);;
//		}
		
		
//		ArrayList list = new ArrayList();
//		list.add("홍길동");
//		list.add("이몽룡");
//		list.add("김삿갓");
//		list.add("김첨지");
//		list.add("심봉사");
//		list.add("심청이");
//		list.add("성춘향");
//		list.remove(1); //이몽룡 삭제, index로 삭제
//		list.remove("김첨지"); //김첨지 삭제, 객체형태로 삭제
//		
//		for (int i=0;i<list.size(); i++) {
//			System.out.println(list.get(i));
//		} // for
		
//		// List : 순서가 있음, 중복 허용
//		ArrayList list = new ArrayList();
//		list.add(1); // add명령어 - 추가
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		
//		list.remove(1); // remove(): 삭제
//		
//		
//		
//		// size() : 컬렉션 크기
//		for (int i=0;i<list.size();i++) {
//			System.out.println(list.get(i)); // get() : 데이터를 읽어옴
//		} // for
		
		
		

	}

}
