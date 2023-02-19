package practice.utility;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.next();
		char[] c = s.toCharArray();
		for (int i = s.length(); i > 0; i--) {
			// String revstring = String.valueOf(c[i - 1]);
			// System.out.print(revstring);
			System.out.print(c[i - 1]);

		}

	}

}
