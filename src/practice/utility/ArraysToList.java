package practice.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysToList {

	public static void main(String[] args) {

		String[] ab = { "vis", "mano", "mohan", "sagar" };
		int[] a = { 5, 34, 34, 54, 45, 345 };
		ArrayList<Integer> all = new ArrayList<Integer>();
		// ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al = new ArrayList<>(Arrays.asList(ab));
		// Collections.addAll(al, ab);
		// adding to list(we can add int value to list using only for loop)
		for (int i = 0; i < a.length; i++) {
			all.add(a[i]);
		}
		// Printing integer value in list
		for (Integer s : all) {
			System.out.println(s);
		}

		// Printing string value in list
		for (String ss : al) {
			System.out.println(ss);
		}
		System.out.println(al.size() + " " + all.size());

	}

}
