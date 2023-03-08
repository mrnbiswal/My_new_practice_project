package practice.utility;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {

		String[] languages = { "Java", "Python", "JavaScript" };
		// List<String> list = Arrays.asList(languages);
		// list.stream().filter((x) -> x.toUpperCase().length() <
		// 5).forEach(System.out::println);

		Arrays.stream(languages).filter(x -> x.length() <= 4).map(String::toUpperCase).forEach(System.out::println);
	}

}
