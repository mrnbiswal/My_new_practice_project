package practice.utility;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		String s = "Manioranjan";
		Scanner sc = new Scanner(s);
		System.out.println(sc.hasNextLine());
		System.out.println(sc.hasNextInt());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
	}

}
