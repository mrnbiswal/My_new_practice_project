package practice.utility.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapOne {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "Manoranjan");
		map.put(2, "Soumyranjan");
		map.put(3, "Niharranjan");
		map.put(4, "Sankarsan");
		map.put(5, "Jagabandhu");
		map.put(6, "chitaranjan");
		map.put(7, "Sudershan");
		map.put(8, "Sudhakar");
		map.put(9, "Profulla");
		map.put(10, "Deepakranjan");
		System.out.println(map);
		Map<String, String> map1 = new TreeMap<>();
		map1.put("Shantilata", "Manoranjan");
		map1.put("Jhili khudi", "Chitaranjan");
		map1.put("Bada bau", "Shankarshan");
		map1.put("Lily khudi", "Soumyaranjan");
		map1.put("Mausi", "Sudersan");
		map1.put("something", "Manoranjan");
		map1.put("mom1", "sastri");
		map1.put("mom2", "Dhukeswara");
		map1.put("mom3", "lankeswara");
		System.out.println(map1);
	}

}
