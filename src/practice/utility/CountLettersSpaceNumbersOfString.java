package practice.utility;

public class CountLettersSpaceNumbersOfString {
	public static void main(String[] args) {
		String s = "Manoranjan age is 27, not count++";

		char[] c = s.toCharArray();
		int letters = 0, digits = 0, spaces = 0, others = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(c[i])) {
				letters++;
			}
			if (Character.isDigit(c[i])) {
				digits++;
			}
			if (Character.isSpace(c[i])) {
				spaces++;
			} else {
				others++;
			}

		}
		System.out.println(s);
		System.out.println("Total length of string is : " + s.length());
		System.out.println("Total characters of that string is : " + letters);
		System.out.println("Total digits of a string is : " + digits);
		System.out.println("Total spaces of string is : " + spaces);
		// System.out.println("Other values of string is : " + others);
	}

}
