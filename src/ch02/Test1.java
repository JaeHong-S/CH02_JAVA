package ch02;
public class Test1 {
	public static void main(String[] args) {
//		실수는 부동 소수형 근사값 10의 -15승 차이는 날 수 있어
		System.out.println(0.1 + 0.2);
//		선언      대입
//		수학에서는 =은 같다. 자바에서는 = 대입 오른쪽 57을 변수 i1에 대입
//		자바에서 같다는 ==
		int i1 = 57;
		byte b1 = 114;  // byte -128 ~ 127
		
		System.out.println(i1);
		System.out.println(b1);
	}
}