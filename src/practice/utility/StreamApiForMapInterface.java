package practice.utility;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamApiForMapInterface {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Singh", "Viswanath");
		hm.put("Bardkar", "Vinayak");
		hm.put("Biswal", "Soumyaranjan");
		hm.put("Mishra", "Ajay");
		hm.put("Nayak", "Mohan");
		hm.put("Nayak", "Sudhakar");
		hm.put("Sahoo", "Sagar");
		hm.put("Biswal", "Manoranjan");
		System.out.println(hm);
		Collection<String> c = hm.values();
		List<String> list = hm.entrySet().stream().filter(x -> x.getKey().toLowerCase().startsWith("n"))
				.map(Map.Entry::getValue).collect(Collectors.toList());
		System.out.println(list);
		Collection<String> cc = hm.keySet();
		Collection<Entry<String, String>> ccc = hm.entrySet();
		System.out.println(c);
		System.out.println(cc);
		System.out.println(ccc);
		Iterator<Entry<String, String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		List<Entry<String, String>> ll = hm.entrySet().stream().filter(x -> x.getValue().toLowerCase().startsWith("m"))
				.collect(Collectors.toList());
		System.out.println(ll);

	}

}
