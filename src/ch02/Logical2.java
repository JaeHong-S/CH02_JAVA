package ch02;
public class Logical2 {
	public static void main(String[] args) {
		boolean b1 = 5 > 3, b2 = 5 < 3, b3 = 5==3, b4 = 5!=3;
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);		
		System.out.println("b1&&b2 = " + (b1&&b2));  // t&& f => f
		System.out.println("b1||b2 = " + (b1||b2));  // t|| f => t
		System.out.println("b1&&b3 = " + (b1&&b3));  // t&& f => f
		System.out.println("b1||b4 = " + (b1||b4));  // t||t => t
		System.out.println("b2&&b4 = " + (b2&&b4));  // f&&t => f
		System.out.println("b2||b4 = " + (b2||b4));  // f||t => t
		System.out.println("b2&&b3 = " + (b2&&b3));  // f&&f=> f
		System.out.println("b2||b3 = " + (b2||b3));  // f||f => f
		System.out.println("b3&&b4 = " + (b3&&b4));  // f&&t => f
		System.out.println("b3||b4 = " + (b3||b4));  // f||t => t
	}
} 