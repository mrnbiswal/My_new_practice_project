package practice.utility;

import java.util.HashSet;
import java.util.Iterator;

public class TraverseHashSet {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(45);
		hs.add(434);
		hs.add(498);
		hs.add(48);
		System.out.println(hs);
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println(" ");
		for (int num : hs) {
			System.out.print(num + " ");
		}
	}

}
