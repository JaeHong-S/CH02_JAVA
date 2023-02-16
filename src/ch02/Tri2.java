package ch02;
public class Tri2 {
	public static void main(String[] args) {
		int num = 243; // 게시판에 저장된 글 수 num이 270개일 경우도 계산 
		int noOfPage = 10;  // 한페이지에 글을 10개씨 게시
//		noOfPage 대신에 직접 10을 사용하면 하드코딩라고 하고 변경할 불편
		int page = num % noOfPage == 0?num / noOfPage : num / noOfPage + 1;
		System.out.printf("글 개수가 %d인경우 %d페이지 필요해",num, page);
	}
}