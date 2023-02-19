package practice.utility;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEgg {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<>(new StringComparator());
		s.add("Anyone");
		s.add("zpmppf");
		s.add("gharka");
		s.add("Nallo");
		s.add("Chalo");
		s.add("Hii");
		s.add("Someone");
		System.out.println(s);
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
