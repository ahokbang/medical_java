package p0628;

import java.util.Arrays;

public class C0628_02 {
// String class의 생성자
	
	public static void main(String[] args) {
		String str = "Hello, World!!";
		char ch = str.charAt(0); // 지정한 위치에 있는 문자 1개를 가져옴.
		System.out.println(ch);
		
		// concat : 문자열 합치기
		String s = "안녕하세요.";
		String s2 = "홍길동입니다.";
		System.out.println(s+s2);
		System.out.println(s.concat(s2)); // 속도가 위에 것보다 더 빠르지만 직관성은 없어. 

		// contains : 문자열에 문자열이 포함되어 있는지 확인
		System.out.println(s.contains("하")); // true, false로 출력
		
		// endsWith : 지정된 문자열로 끝나는지 확인
		String e = "abc.txt";
		System.out.println(e.endsWith("txt")); // true, false로 출력
	
		// length : 문자열의 길이 확인
		String l = "안녕하세요. 반갑습니다.";
		System.out.println(l.length());
		
		// replace : 문자열 중 해당 문자열을 다른 문자열로 대체
		String r = "화면을 중지합니다. 중지하려면 중지 버튼을 클릭하세요.";
		String r2 = r.replace("중지","Stop");
		System.out.println(r);
		System.out.println(r2);
		
		// indexOf : 해당 문자열이 있으면 위치값을 리턴, 없으면 -1을 리턴
		String i = "abcdefghijklmn";
		System.out.println(i.indexOf("f")); // 5
		System.out.println(i.indexOf("z")); // -1
		
		// subString : 원하는 위치(index)의 문자열을 출력`	
		String sub = "abc aaa aac bbc bbb ccc";
		System.out.println(sub.length()); // 23
		System.out.println(sub.substring(8,15)); // acc bbc
		System.out.println(sub.substring(8)); // acc bbc bbb ccc
		
		// split : 문자열을 분리자로 나누어 문자열로 리턴
		String sp = "국어, 영어, 수학, 합계";
		String[] spArr = sp.split(",");
		System.out.println(Arrays.toString(spArr));
		String sp2 = "국어/영어/수학/합계";
		String[] spArr2 = sp.split("/");
		System.out.println(Arrays.toString(spArr2));
		
		// trim : 전체 문자열 앞, 뒤 공백 제거 --> 문자열 내부 공백 제거하지 않음.
		String tr = "         안녕하세요. 반갑습니다.    ";
		System.out.println(tr);
		System.out.println(tr.trim());
		// replace : 모든 공백 제거
		System.out.println(tr.replace(" ", "")); // 안녕하세요와 반갑습니다 사이의 공백도 없애고 싶을 때 replace 사용
		
		
		int num = 0;
		String st1 = ""+num;
		String st2 = String.valueOf(num);
		
		
	
	} // main

} // class
