package practice.utility;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEg {
	public static void main(String[] args) {

		SortedSet<String> ss = new TreeSet<String>(new StringComparator());
		ss.add("Viswanath");
		ss.add("Vinayak b");
		ss.add("Ramdarash");
		ss.add("Ajay mishra");
		ss.add("Moahan manipal");
		ss.add("sagar shaoo");
		ss.add("Manoranjan");
		System.out.println(ss);
		Iterator<String> itr = ss.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
