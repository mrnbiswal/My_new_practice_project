package practice.utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetToArrayAndTraverse {
	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
		s.add(89);
		s.add(85);
		s.add(90);
		s.add(9);
		s.add(9);
		s.add(8);
		System.out.println(s);
		int n = s.size();
		int[] a = new int[n];
		int j = 0;
		for (int i : s) {
			a[j++] = i;
			System.out.print(Arrays.toString(a));
		}

	}

}
