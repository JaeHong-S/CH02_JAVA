package ch02;

public class Sustitute3 {
	public static void main(String[] args) {
		int i1 = 12, i2 = 7;
		i1 += i2; // i1=i1+i2 => 12+7 => 19
		System.out.println("i1 = "+i1+", i2 = "+i2);
		i1 -= i2; // i1=i1-i2=> 19 - 7 => 12
		System.out.println("i1 = "+i1+", i2 = "+i2);
		i1 *= i2; // i1=i1*i2=>12*7=>84
		System.out.println("i1 = "+i1+", i2 = "+i2);
		i1 /= i2; // i1=i1/i2=> 84/7=> 12
		System.out.println("i1 = "+i1+", i2 = "+i2);
		i1 %= i2; // i1=i1%i2=>12%7=> 5
		System.out.println("i1 = "+i1+", i2 = "+i2);
	}
}