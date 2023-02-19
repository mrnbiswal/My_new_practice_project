package practice.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiFilterString {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();

		ls.add("manoranjan");
		ls.add("manoranjan");
		ls.add("manoranjan");
		ls.add("viswanath");
		ls.add("Ramachandra");
		ls.add("sudhakar");
		ls.add("sudhakar");
		ls.add("Ramachandra");
		ls.add("Aman");
		System.out.println(ls);
		List<String> str = ls.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(str);

	}

}
