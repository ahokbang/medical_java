package p0619;

public class C0619_10 {

	public static void main(String[] args) {
		// 
		System.out.printf("%4d", 4);
		System.out.println();
		System.out.printf("%04d", 4);
		System.out.println();
		String stuNo = String.format("%04d", 5);
		System.out.println(stuNo);
	}

}
