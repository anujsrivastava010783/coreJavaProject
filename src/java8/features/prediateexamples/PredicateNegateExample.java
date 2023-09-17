package java8.features.prediateexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNegateExample {

	public static void main(String[] args) {
		// Find all elements not start with ‘A’.
		
		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		
		Predicate<String> startWithA = x -> x.startsWith("A");
		list.stream().filter(startWithA.negate()).collect(Collectors.toList()).forEach(System.out::println);
	}

}
