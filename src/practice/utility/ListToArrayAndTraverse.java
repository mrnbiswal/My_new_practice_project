package practice.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListToArrayAndTraverse {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(34);
		l.add(3456);
		l.add(98);
		l.add(56);
		l.add(89);
		l.add(37);
		l.add(35);
		l.add(4);
		System.out.println(l);

//		int[] a = new int[l.size()];
//		for (int num = 0; num < l.size(); num++) {
//			a[num] = l.get(num);
//		}
		Integer[] a = l.toArray(new Integer[0]);
		for (int j : a) {
			System.out.print(j + " ");
		}
		Iterator<Integer> i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		ListIterator<Integer> li = l.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
