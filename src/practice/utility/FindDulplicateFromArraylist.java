package practice.utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class FindDulplicateFromArraylist implements StreamApiInterface {

	// WAP to iterate array

//	String findDuplicateCharaterFromArray(String[] arr) {
//		ListIterator<String> listiterator = Arrays.asList(arr).listIterator();
//		while (listiterator.hasNext()) {
//			System.out.println(listiterator.next());
//		}
//		return "listiterator.next()-1" + "c[i].toString()";
//	}

	public static void main(String[] args) {
		String[] arr = { "abcdp", "efNAgi", "hnPGDRE", "xNmoP", "tqGlA", "adAFe9" };
		FindDulplicateFromArraylist duplicate = new FindDulplicateFromArraylist();
		// duplicate.findDuplicateCharaterFromArray(arr);
		duplicate.FindDuplicateCharacterUsingStreamApi(arr);
		duplicate.arraytoset(arr);
		// duplicate.FindDuplicateCharacterUsingStreamApi();

	}

	@Override
	public String FindDuplicateCharacterUsingStreamApi(String[] arr) {
		ListIterator<String> listiterator = Arrays.asList(arr).listIterator();
		while (listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}
		return "listiterator.next()-1";

	}

	@Override
	public String arraytoset(String[] arr) {
		Set<String> set = new HashSet<String>();
		Collections.addAll(set, arr);
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		return "itr.next()";
	}

}
