package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		// START find out all the numbers starting with 1 using Stream functions.
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		list.stream()
		.map(s -> s + "")  // Convert integer to String
		.filter(s -> s.startsWith("1"))
		.forEach(System.out::println);
		
		// END find out all the numbers starting with 1 using Stream functions.
		Stream<String> st = Stream.of("AB","CD","EF");
		System.out.println(st);
		Stream<String> filterStream = st.filter(i-> i.contains("AB"));
		System.out.println(filterStream);
		List<String> ls = filterStream.collect(Collectors.toList());
		System.out.println(ls);
		System.out.println(st);
		System.out.println(filterStream);
		List<String> ls1 = filterStream.collect(Collectors.toList());
		System.out.println(ls1);
	}

}
