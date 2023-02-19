package practice.utility;

import java.util.Comparator;

public class mycomparator1 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer i11 = (Integer) o1;
		Integer i22 = (Integer) 02;
		
		//return i11.compareTo(i22);
		  return -i11.compareTo(i22);
		// return i22.compareTo(i11);
		// return -i22.compareTo(i11);
		// return +1;
		// return -1;
		// return 0;
	}

}
