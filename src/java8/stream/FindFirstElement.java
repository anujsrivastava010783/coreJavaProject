package java8.stream;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		// START find the first element of the list using Stream functions.
		myList
		.stream()
		.findFirst()
		.ifPresent(System.out::println);
		// END find the first element of the list using Stream functions.
	}

}
