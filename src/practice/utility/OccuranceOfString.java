package practice.utility;

import java.util.ArrayList;
import java.util.List;

public class OccuranceOfString {
	public static void main(String[] args) {

		String s = "sudhakarbhainayak";
		OccuranceOfString.listOfDuplicateCharactors(s);
		//OccuranceOfString() occ = new OccuranceOfString();
		
	}

	static List[] listOfDuplicateCharactors(String s) {
		// int count = 0;
		char[] c = s.toCharArray();
		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		for (int i = 0; i < c.length; i++) {
			// System.out.println(c[i]);
			for (int j = i + 1; j < c.length; j++) {

				if (c[i] == c[j]) {

					list1.add(c[i]);
					list2.add(c[j]);
					// System.out.println(count);
					System.out.println(list1 + " " + list2);
					// System.out.println(list2);
					// count++;
				}
			}

		}
		return new List[] { list1, list2 };

	}
}
