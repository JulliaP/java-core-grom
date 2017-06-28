package lesson3;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a = 60; /* 60 =00111100 */
		int b = 13; /* 13 =00001101 */
		int c = 0;
		c = a & b; /* 12 =00001100 */
		System.out.println("a & b =" + c);

		c = a | b; /* 61 = 00111101 */
		System.out.println("a |b=" + c);

		c = a ^ b;
		/* 49 = 00110001 */;
		System.out.println("a^b=" + c);

		c = a << 2;
		/* 240 = 111100000 */;
		System.out.println("a<<2=" + c);

		c = a >> 2;
		/* 15 = 1111 */;
		System.out.println("a>>2=" + c);

	}

}
