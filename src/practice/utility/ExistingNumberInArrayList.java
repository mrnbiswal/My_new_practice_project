package practice.utility;

import java.util.ArrayList;

public class ExistingNumberInArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("mano");
		list.add("vis");
		list.add("shaoo");
		list.add("ramu");
		list.add("raghu");
		String s = "ramu";
		for (String i : list) {
			if (i == s) {
				System.out.println(i);
			}
		}
		if (list.contains(s)) {
			System.out.println("Object found");
		} else {
			System.out.println("Not found");
		}

	}

}
