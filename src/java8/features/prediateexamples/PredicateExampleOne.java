package java8.features.prediateexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExampleOne {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Predicate<Integer> numGreaterThan5 = x -> x > 5;
		
		list.stream().filter(numGreaterThan5).collect(Collectors.toList()).forEach(System.out::println);
		
		Predicate<String> predicate = x -> x.length() == 3;
		boolean flag = predicate.test("Anuj");
		
		System.out.println(flag);
		
		// Predicate Chaining example with using test() function.
		Predicate<String> startWithA = x -> x.startsWith("a");
		Predicate<String> startWithM = x -> x.startsWith("m");
		
		boolean result1 = startWithA.or(startWithM).test("mihu");
		System.out.println(result1);
	}

}
