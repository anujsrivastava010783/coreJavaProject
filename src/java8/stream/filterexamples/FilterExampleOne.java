package java8.stream.filterexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExampleOne {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		List<String> myList = lines
				             .stream()
				             .filter(p-> !"mkyong".equals(p)).collect(Collectors.toList());
		myList.forEach(System.out::println);
	}
}
