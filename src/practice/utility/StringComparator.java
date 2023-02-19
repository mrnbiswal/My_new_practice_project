package practice.utility;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String s1 = o1.toString();
		String s2 = (String) o2;
		// return 0;
		// return -s1.compareTo(s2);
		// return s1.compareTo(s2);
		return s2.compareTo(s1);
		// return -s2.compareTo(s1);
		// return +1;
		// return -1;
	}

}
