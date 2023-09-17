package java8.features.prediateexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateOrExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
		Predicate<String> lengthIs3 = x -> x.length()==3;
		Predicate<String> startWithA = x -> x.startsWith("A");
		
		list.stream().filter(lengthIs3.or(startWithA)).collect(Collectors.toList()).forEach(System.out::println);

	}

}
