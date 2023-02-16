package ch02;
public class Spec1 {
	public static void main(String[] args) {
//		\t tab를 누른 효과 										
		System.out.println("대\t박\t사\t건");				
//		\n은 줄바꿈 \r커서를 맨앞으로 \n은 new line줄바꿈, \r은 carriage return 커서를 맨 앞으로
		System.out.println("대박\n사\r건");
//		\r\n은 enter
		System.out.println("대박\r\n사건");
//		"을 출력할 때 \은 뒤에 있는 "는 문자열 종료가 아니라 "문자 자체
		System.out.println("\"");
		System.out.println("'");
//		\ 뒤에 있는 \는 문자 자체
		System.out.println("\\");
	}
}