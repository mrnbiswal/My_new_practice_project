package practice.utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiToUpperCase {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("Sudhakar bhai", "Viswanath", "manoranjan", "family", "mohan");

		String ll = l.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(l);
		System.out.println(ll);
		List<Integer> li = Arrays.asList(54, 45, 34, 687, 4, 67, 45, 34, 5968, 9687, 698);
		System.out.println(li);
		List<Integer> lli = li.stream().map(x -> x * x).distinct().collect(Collectors.toList());
		System.out.println(lli);
		int i = li.stream().max(Integer::compare).get();
		System.out.println(i);
		int ii = li.stream().min(Integer::compare).get();
		System.out.println(ii);
		Set<Integer> b = li.stream().map(x -> x * 100).collect(Collectors.toSet());
		Iterator<Integer> itr = b.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println(b);
	}
}
