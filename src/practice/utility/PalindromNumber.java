package practice.utility;

import java.util.Scanner;

public class PalindromNumber {

	public static boolean checkPalindrom(int a) {
		int temp = 0;
		int x = a;
		while (a > 0) {
			int z = a % 10;
			a = a / 10;
			temp = temp * 10 + z;
		}
		if (temp == x) {
			System.out.println(x + " is a palindrom number");
			return true;

		} else {
			System.out.println(x + " is not a palindrom number");
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println(checkPalindrom(a));
		;
	}

}
