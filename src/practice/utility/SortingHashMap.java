package practice.utility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortingHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Mano");
		hm.put(2, "Mahan");
		hm.put(3, "Viswanath");
		hm.put(1, "Sagar");
		hm.put(4, "Ramdarash");
		hm.put(5, "Misha");
		 System.out.println(hm);
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> key = it.next();
			System.out.println(key);
		}

	}

}
