package java8.features.prediateexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateAndExample {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Predicate<Integer> numGreaterThan5 = x -> x > 5;
		
		Predicate<Integer> numLessThan8 = x -> x < 8;
		
		list.stream().filter(numGreaterThan5.and(numLessThan8)).collect(Collectors.toList()).forEach(System.out::println);
		

	}

}
