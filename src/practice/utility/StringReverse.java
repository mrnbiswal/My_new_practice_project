package practice.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

	public static void main(String[] args) throws IOException {

//		String str = "";
//		System.out.println("Enter a string");
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		str = bf.readLine();
//		char[] c = str.toCharArray();
//		for (int i = c.length - 1; i >= 0; i--) {
//			System.out.print(c[i]);
//		}

		String str = "Manoranjan";
		char[] c = str.toCharArray();
		for (int i = str.length(); 1 <= i; i--) {
			// System.out.println(i);
			System.out.print(c[i - 1]);
		}
		System.out.println(" ");
		String s = "saha";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println(sb.reverse());
		String ss = "vishwanath";
		int i = ss.length();
		while (i > 0) {
			System.out.print(ss.charAt(i - 1));
			i--;
		}

	}
}
