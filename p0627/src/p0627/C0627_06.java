package p0627;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
// 메서드 예외 선언, 파일 만들고 저장하기 
public class C0627_06 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("저장할 파일 이름을 입력하세요. >> ");
		String fileName = scan.nextLine();
		if(fileName.equals("") || fileName == null)
			fileName = "제목없음";
		
		File f = new File("c:/save/"+fileName+".txt"); // aaa.txt
		
		f.createNewFile();
		
		System.out.println("파일 1개가 저장되었습니다.");
	} // main

	
// Exception 처리 : try-catch, throws Exception 
	

//	파일, DB 처리 시에는 try-catch 무조건 사용해준다!
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("저장할 파일 이름을 입력하세요. >> ");
//		String fileName = scan.nextLine();
//		if(fileName.equals("") || fileName == null)
//			fileName = "제목없음";
//		
//		File f = new File("c:/save/"+fileName+".txt"); // aaa.txt
//		
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} // try-catch
//		
//		System.out.println("파일 1개가 저장되었습니다.");
//	} // main

}
