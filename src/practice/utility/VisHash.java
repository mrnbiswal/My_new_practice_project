package practice.utility;

import java.util.HashMap;
import java.util.Iterator;

public class VisHash {

	public static void main(String[] args) {

		HashMap<Integer, String> vis = new HashMap<Integer, String>();
		vis.put(1, "sagar");
		vis.put(2, "Viswanath");
		vis.put(3, "Mama");
		vis.put(4, "Ramdarash");
		vis.put(5, "Mishra");
		vis.put(6, "Mano");
		vis.put(7, "Mohan");
		System.out.println(vis);
		vis.put(2, "Ram");
		System.out.println(vis);
		vis.clone();
		System.out.println(vis);
		vis.remove(6);
		System.out.println(vis);
		vis.replace(4, "Ramdarash1");
		System.out.println(vis);
		System.out.println(vis.size());
		vis.putIfAbsent(6, "Mano");
		System.out.println(vis);
		vis.toString();
		System.out.println(vis);
		vis.replace(2, "Ram", "Viswanath");
		System.out.println(vis);
		System.out.println(vis.isEmpty());
		for (int key : vis.keySet()) {
			System.out.println("Key :" + key + " :: Value :" + vis.get(key));
		}
		Iterator<Integer> it = vis.keySet().iterator();	
		while (it.hasNext()) {
			int key = it.next();
			System.out.println("Key :" + key + "  Value :" + vis.get(key));
		}
		vis.clear();
		System.out.println(vis);

	}

}
