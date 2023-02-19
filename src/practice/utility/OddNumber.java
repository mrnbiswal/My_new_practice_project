package practice.utility;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int x = sc.nextInt();
		if ((x % 2) == 0) {
			System.out.println(x + ": is  a even number.");
		} else {
			System.out.println(x + ": is a odd number");
		}
	}

}
