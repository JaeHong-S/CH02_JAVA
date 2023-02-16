package ch02;
public class Char2 {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '대'; // ''문자
//		char c3 = "헐"; // ""문자열
//		char c4 = 'aa'; // 문자는 한글자
		char c5 = '\u0041'; // \\u 유니코드라는 의미
//		char c6 = ''; // 한글자
		System.out.println("c1 = "+ c1);
		System.out.println("c2 = "+ c2);
		System.out.println("c5 = "+ c5);
	}
}