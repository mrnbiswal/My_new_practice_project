package practice.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTraverse {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(34);
		al.add(65);
		al.add(67);
		System.out.println(al);
		for (Integer num : al) {
			System.out.println(num);
		}
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		ListIterator<Integer> lit = al.listIterator();
		while (lit.hasNext()) {
			System.out.print(lit.next() + "  ");
		}

	}

}
