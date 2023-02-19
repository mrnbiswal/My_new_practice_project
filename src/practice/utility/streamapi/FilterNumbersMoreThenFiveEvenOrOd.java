package practice.utility.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbersMoreThenFiveEvenOrOd {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(678);
		list.add(465);
		list.add(345);
		list.add(36);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		System.out.println(list.stream().filter(x -> ((x % 2) != 0) && x > 3).collect(Collectors.toList()));
		System.out.println(list.stream().filter(x -> ((x % 2) == 0) && x > 4).collect(Collectors.toList()));

	}
}
