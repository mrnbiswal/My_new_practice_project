package practice.utility;

public class DuplicateArray {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 2, 5, 7, 2, 7, };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate numbers are : " + arr[j]);
				}
			}
		}

	}

}
