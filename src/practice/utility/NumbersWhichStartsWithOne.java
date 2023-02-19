package practice.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumbersWhichStartsWithOne {

	public static void main(String[] args) {
		int firstDigit = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(12);
		list.add(13);
		list.add(23);
		list.add(35);
		list.add(453);
		list.add(193);
		list.add(389);
		list.add(587);
		list.add(4567);
		list.add(1984);
		list.add(1045);
		System.out.println(list);
		// Iterator<Integer> itr = list.listIterator();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			if (firstDigit == 1) {
				int totalDigits = (int) Math.log10(list.get(i));
				firstDigit = list.get(i) / ((int) Math.pow(10, totalDigits));
				System.out.println(list.get(i));
			}
		}

//		List<String> list = new ArrayList<>();
//		list.add("manoranjan");
//		list.add("rajesh");
//		list.add("prafulla bhai");
//		list.add("subal god father");
//		list.add("hemalata");
//		list.add("kuni dei");
//		list.add("mobau");
//		list.add("mili");
//		list.add("bindu rekha biswal");
//		list.add("nira");
//		// list.stream().filter((x) ->
//		// x.startsWith("s")).map(String::toUpperCase).forEach(System.out::println);
//		list.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
//		boolean match = list.stream().anyMatch((x) -> x.contains("dei"));
//		System.out.println(match);
//		Optional<String> reduced = list.stream().reduce((s1, s2) -> s1 + "#" + s2);
//		reduced.ifPresent(System.out::println);
//		list.stream().filter(x -> x.startsWith("m")).findFirst().ifPresent(System.out::println);

//		List<Integer> list1 = new ArrayList<>();
//		for (int i = 0; i < 100; i++) {
//			list1.add(i);
//		}
//		System.out.println(list1);
//		Stream<Integer> stream = list1.parallelStream();
//		Integer[] evenarr = stream.filter(x -> x % 2 == 0).toArray(Integer[]::new);
//		System.out.println(evenarr.toString());
		// String s = list1.toString();
		// System.out.println(s);
		// String s1 = String.valueOf(list1);
		// System.out.println(s1);
//		StringBuffer sb = new StringBuffer(list1.toString());
//		System.out.println(sb);
//		String ss = new String(list1.toString());
//		System.out.println(ss);

	}

}
