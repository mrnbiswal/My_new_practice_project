package practice.utility;

import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>(new mycomparator1());
		ts.add(986);
		ts.add(989);
		ts.add(988);
		ts.add(983);
		ts.add(9854);
		ts.add(954);
		ts.add(945);
		System.out.println(ts);
	}

}
