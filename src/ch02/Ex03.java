package ch02;
public class Ex03 {
	public static void main(String[] args) {
		int num = 24;
//		연산순서는 *,/, %를 먼저하고 +, -를 나중에 한다
//		num%10 => 24 % 10 => 4  => 10 - 4 => 6
		System.out.println(10 - num%10);
	}
}