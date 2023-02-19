package practice.utility;

import java.util.TreeSet;

public class TreeSetString {
	public static void main(String[] args) {
		TreeSet<String> tss = new TreeSet<String>(new StringComparator());
		tss.add("Manoranjan");
		tss.add("Vicky");
		tss.add("ram");
		tss.add("Gyana");
		tss.add("Jyoti");
		tss.add("Aman");
		System.out.println(tss);
	}
}
