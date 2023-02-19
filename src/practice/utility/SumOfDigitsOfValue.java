package practice.utility;

import java.util.Scanner;

public class SumOfDigitsOfValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("Enter another bumber : ");
		int b = sc.nextInt();
		int temp = 0;
		int i;
		while (a != 0) {
			int x = a % 10;
			a = a / 10;
			temp = temp + x;
			// System.out.println(temp);
		}
		System.out.println(temp);
		for (i = 0; b != 0; b = b / 10) {
			i = i + b % 10;
		}
		System.out.println(i);

	}

}
