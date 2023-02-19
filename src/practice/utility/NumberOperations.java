
package practice.utility;

import java.util.Random;

public class NumberOperations {

	public static void main(String[] args) {

		int z = 232;
		int a = 232;
		int b = a % 10;
		int g = a / 10;
		int c = z / 10;
		int y = 0, x = 0;
		x = x + b;
		y = y + c;
		System.out.println(g + "  " + c + "  " + y + "  " + x);
		Random number = new Random();
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			System.out.println(number.nextInt());

		}
	}
}
