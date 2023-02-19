package practice.utility;

import java.util.Arrays;

public class ArrayToMap {
	public static void main(String[] args) {
		String[][] arr = { { "Mohan", "Medical job" }, { "Nandini", "Training" }, { "Sudhakar bhai", "Zomato" },
				{ "Sagar", "IT job" }, { "Viswanath", "jobsearching" }, { "Manoranjan", "jobless" } };

		System.out.println(Arrays.deepToString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			// System.out.println();
		}

	}
}
