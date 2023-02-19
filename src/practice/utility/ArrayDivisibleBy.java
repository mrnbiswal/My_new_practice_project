package practice.utility;

import java.util.Scanner;

public class ArrayDivisibleBy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			// System.out.println(sc.nextInt());
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == x) {
				System.out.println("Found at index :" + j);
			}
			for (int i : arr) {
				System.out.println(i);
			}
		}
	}

}
