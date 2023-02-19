package practice.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi1 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Ma");
		l.add("Vis");
		l.add("Sudhakar");
		l.add("Sagar");
		l.add("Mohan");
		l.add("");
		l.add("Ramdarash");
		l.add("Mishraji");
		System.out.println(l);
		System.out.println(l.size());
		List<String> count = l.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(count);
	}
}
