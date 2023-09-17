package java8.stream.mapexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseExample {

	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");
		//List<String> myList = alpha.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		List<String> myList = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
		myList.forEach(System.out::println);
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		num.stream().map(x -> x*2).collect(Collectors.toList()).forEach(System.out::print);

	}

}
