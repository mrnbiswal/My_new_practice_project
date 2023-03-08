package practice.utility.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondHighestNumber {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(45);
		l.add(45);
		l.add(87);
		l.add(67);
		l.add(678);
		l.add(89);
		l.add(457);
		l.add(5456);
		Object[] arr = l.toArray();
//		for (int x : l) {
//			System.out.println(x + "");
//		}
		for (int i = 0; i < l.size(); i++) {
			arr[i] = l.get(i);
			System.out.println(arr[i]);
		}
		System.out.println(arr);
		/* 1st way to get 2nd highest number */
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l.get(1));

		/* 2nd way to get 2nd highest number */
		Collections.sort(l, (t1, t2) -> t1.compareTo(t2));
		System.out.println(l.get(l.size() - 2));

		/* 3rd way to get 2nd highest number */
//		Collections.sort(l);
//		System.out.println(l);
//		System.out.println(l.get(l.size() - 2));
		
		
		
		

	}

}
