package practice.utility;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ChangingArraylistToSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Manoranjan Biswal.");
		set.add("Sudhakar Nayak.");
		set.add("Mohan shrilal Nayak.");
		set.add("Soumya ranjan Biswal.");
		set.add("Shantilata Biswal.");
		set.add("Arvind bangalore.");
		set.add("Something is going on.");
		set.add("Manoranjan Biswal.");
		Iterator<String> iterator = set.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		System.out.println(set);
		Set<String> hashsettotreeset = new TreeSet<>(set);
		System.out.println(hashsettotreeset);
		String[] arr = { "Bindurekha Biswal.", "Rahmirekha Biswal.", "Hemalata Biswal.", "Grishmalata Biswal." };
		// Set<String> diffset = new TreeSet<>(Arrays.asList(arr));
		// System.out.println(diffset);
		TreeSet<String> sett = new TreeSet<>();
		Collections.addAll(sett, arr);
		System.out.println(sett);
		// System.out.println(s);

	}
}
