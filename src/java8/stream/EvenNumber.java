package java8.stream;

import java.util.Arrays;
import java.util.List;

//Given a list of integers,
public class EvenNumber {

	public static void main(String[] args) {
		
		// START find out all the even numbers that exist in the list using Stream functions
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		list
		.stream()
		.filter(n -> n%2 == 0)
		.forEach(System.out::println);
		// END find out all the even numbers that exist in the list using Stream functions
	}

}
