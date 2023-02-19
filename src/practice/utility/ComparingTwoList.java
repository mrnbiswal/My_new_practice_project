package practice.utility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComparingTwoList {
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("manoranjan", "ranjit", "sudersan", "sudhakar");
		List<String> l2 = Arrays.asList("manoranjan", "viswanath", "sudersan", "rajsekhar");
		List<String> smlist = l1.stream().filter(e -> (l2.stream().filter(d -> d.equals(e)).count()) > 1)
				.collect(Collectors.toList());
		System.out.println(smlist);
		boolean b = l1.equals(l2);
		if (b) {
			System.out.println("Both lists are equal");
		} else {
			System.out.println("Both lists are not equal");
		}
		// List<String> qwerty =
		// l1.stream().filter(x->(l2.stream().filter(y->y.equals(x)).count())<1).collect(Collectors.toList());

		List<String> lastn = l1.stream().filter(x -> x.endsWith("n")).collect(Collectors.toList());
		l2.stream().filter(x -> x.startsWith("r")).forEach(System.out::println);
		System.out.println(lastn);
		
	}
}
