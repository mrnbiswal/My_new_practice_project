package practice.utility;

import java.util.HashSet;
import java.util.Iterator;

class ExistingNumberInHashSet {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Mohan");
		hs.add("Mano");
		hs.add("Manipal");
		hs.add("Sagar");
		hs.add("Viswanath");
		String s = "Mano";
		Iterator<String> it = hs.iterator();
//		while (it.hasNext()) {
//			if (it.equals(s)) {
//				System.out.println(it);
//			}
//		}
		for (String ss : hs) {
			if (ss == s) {
				System.out.println(ss);
			}
		}
		if (hs.contains(s)) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}

	}

}
