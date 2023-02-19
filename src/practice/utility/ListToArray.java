package practice.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(78);
		l.add(56);
		l.add(23);
		l.add(89);
		l.add(89);
		l.add(89);
		System.out.println(l);
		for (Integer num : l) {
			System.out.println(num);
		}
		// int[] j = new int[l.size()];
		// Integer[] j = l.toArray(new Integer[l.size()]);
		Integer[] j = Arrays.copyOf(l.toArray(), l.size(), Integer[].class);
		for (int i = 0; i < l.size(); i++) {
			j[i] = l.get(i);
			System.out.print(j[i] + " ");
		}

	}

}
