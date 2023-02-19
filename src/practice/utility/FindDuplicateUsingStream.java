package practice.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FindDuplicateUsingStream {
	private List[] mapToList(Map<String, String> map) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		for (Entry<String, String> entry : map.entrySet()) {
			String str1 = entry.getValue();
			list1.addAll(Arrays.asList(str1));
			String str2 = entry.getKey();
			list2.addAll(Arrays.asList(str2));
		}
		System.out.println(list1);
		System.out.println(list2);
		return new List[] { list1, list2 };
	}

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("a", "Manoranjan");
		map.put("c", "Soumya");
		map.put("n", "Moahan");
		map.put("j", "Visa");
		map.put("t", "Raju");
		map.put("b", "Someone");
		System.out.println(map);
		Map<String, String> treemap = new TreeMap<>(map);
		System.out.println(treemap);
		FindDuplicateUsingStream returnlist = new FindDuplicateUsingStream();
		returnlist.mapToList(treemap);

	}

}
