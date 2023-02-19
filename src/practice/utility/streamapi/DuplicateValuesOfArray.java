package practice.utility.streamapi;

public class DuplicateValuesOfArray {

	public static void main(String[] args) {

		int[] arr = { 3549, 354, 354, 345, 235, 678, 79, 98560, 456, 3245, 235, 789, 645, 456, 785, 4567 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		// Set<Integer> set = new HashSet<>();
//		list.stream().filter(x -> Collections.frequency(list, x) > 1).collect(Collectors.toSet())
		// .forEach(System.out::println);
		// System.out.println(set);
		// Arrays.stream(arr).filter(x->!set.addAll(arr)).collect(Collectors.toSet()).forEach(System.out::println);

	}
}
