package practice.utility;
 
public class DuplicateCharInString {

	public static void main(String[] args) {
		String str = "chitaranjan";
		char[] c = str.toCharArray();
		for (int i = 0; str.length() > i; i++) {
			// System.out.println(c[i]);
			for (int j = i + 1; str.length() > j; j++) {
				if (c[i] == c[j]) {
					System.out.println(c[j]);
				}

			}

		}

	}

}
