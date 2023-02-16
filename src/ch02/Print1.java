package ch02;

public class Print1 {
	public static void main(String[] args) {
		System.out.printf("%d출력\n", 16);   // 16
		System.out.printf("%5d출력\n", 16);  // 5칸확보하고 16
		System.out.printf("%-5d출력\n", 16); //      "   앞에서부터 16
		System.out.printf("%05d출력\n", 16); //      " 빈칸은 0으로 채워
	}
}