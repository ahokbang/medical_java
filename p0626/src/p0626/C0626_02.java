package p0626;

public class C0626_02 {

	public static void main(String[] args) {
		// 
		Buyer b = new Buyer("aaa","1111",1000,0);
		
		// 구매내역
//		Product[] p = new Product[10];
		
		// TV 구매
//		Tv t = new Tv(); // 객체선언
//		b.buy(new Tv()); // TV 1대 구매, 객체 선언 하지 않아도 되서 이 방법이 더 편리		
		Product t = new Tv(); // 객체선언
		Product t2 = new Tv(); // 객체선언
		b.buy(t); // TV 1대 구매
		System.out.println("TV 1대 구매");
		b.buy(t2); // TV 1대 구매
		System.out.println("TV 1대 구매");
		b.buy(new Tv()); // TV 1대 구매
		
		// Computer 구매
//		b.buy(new Computer()); // 객체 선언 하지 않아도 되서 이 방법이 더 편리 
		Product c = new Computer();
		b.buy(c); // 객체 선언 하지 않아도 되서 이 방법이 더 편리 
		System.out.println("Computer 1대 구매");
		
		// Audio 구매
//		b.buy(new Audio());
		Product a = new Audio();
		b.buy(a);

		// 냉장고 구매
//		b.buy(new Refrigerator()); //error : Product 상속을 안 받았기 때문
//		b.buy(new Refrigerator()); // Buyer에 메소드 생성 후 주석처리 해도 에러 발생하지 않음
		Product r = new Refrigerator();
		b.buy(r);
		
		// cart의 제품명, 가격을 모두 출력하시오.
		// b.cart : 배열
		// b.list
		b.summary();
//		System.out.println("[ 구매내역 ]");
//		int sum = 0;
//		for(int i=0;i<5;i++) {
////			Product p = b.list.get(i); // error 
//			Product p = (Product)b.list.get(i); // 형변환
////			System.out.println(b.list.get(i)); // 주소값 출력
//			System.out.println(p.pName); // 주소값 출력
////			System.out.println(b.cart[i].pName);
////			// 총 구매금액
////			// b.price
////			sum += b.cart[i].price;
//			sum += p.price;
//		}
//		System.out.println("총 구매 개수 : "+b.list.size()+"개");
//		System.out.println("총 구매금액 : "+sum+" 만원");
		
	}

}
