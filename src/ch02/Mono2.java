package ch02;

public class Mono2 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 7;
//		 5 * 6 + (2+7)*3 => 30 + 9 * 3 => 30 + 27 => 57
		int k1 = 5 * ++i1 + (2 + i2--) * 3; // i1은 1증가하여 연산, i2는 연산이 끝난 후에 1감소
//		i1, i2, k1을 출력하고 왜 값이 그렇게 나왔나 생각
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("k1 = "+k1);
	}
}