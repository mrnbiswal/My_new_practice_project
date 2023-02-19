package practice.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Infosys {
	public static void main(String[] args) {
		ArrayList<Integer> Numbers = new ArrayList<Integer>();

		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);

		// List<Integer> uniqueNumbers =
		// Numbers.stream().distinct().collect(Collectors.toList());
		// System.out.println("Aditi_Arpit_Apoorva_Aditi_Shreya_Arpit");
		Iterator<Integer> itr = Numbers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		for (int i = 0; i < Numbers.size(); i++) {
			System.out.println(Numbers.get(i));
		}
	}

}
