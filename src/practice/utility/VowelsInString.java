package practice.utility;

public class VowelsInString {

	public static boolean checkVowels(String s) {
		return s.toLowerCase().matches(".*[aeiou].*");
	}

	public static void main(String[] args) {
		System.out.println(checkVowels("MANO"));
		System.out.println(checkVowels("WQTRYPKL"));
		System.out.println(checkVowels("K"));
		System.out.println(checkVowels("mano"));
	}
}
