package practice.utility.streamapi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateConsumerFunctionSupplier {

	public static void main(String[] args) {
		// Predicate
		Predicate<String> checklength = str -> str.length() > 5;
		System.out.println(checklength.test("Mano"));
		// Consumer
		Person p = new Person();
		Consumer<Person> setName = t -> t.setName("Manoranjan");
		setName.accept(p);
		System.out.println(p.getName());
		// Function
		Function<Integer, String> getInt = t -> t * 10 + "Something";
		System.out.println(getInt.apply(2));
		//Supplier
		Supplier<Double> getRandomDouble = () -> Math.random();
		System.out.println(getRandomDouble.get());
	}

}
