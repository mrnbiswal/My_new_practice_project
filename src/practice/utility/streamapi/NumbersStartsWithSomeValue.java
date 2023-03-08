package practice.utility.streamapi;

import java.util.Arrays;

public class NumbersStartsWithSomeValue {

	public static void main(String[] args) {
		int[] arr = { 384658, 354, 254, 678, 345, 34534, 789, 456, 456, 986, 456983, 672345, 5645 };
		Arrays.stream(arr).filter(x -> String.valueOf(x).startsWith("4")).sorted().forEach(s -> System.out.println(s));
		// System.out.print(arr1);
		

	}
}
