package java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
	HashSet<String> hashSet = 	new HashSet<>();
	System.out.println(hashSet.add("Anuj"));
	System.out.println(hashSet.remove("Anuj"));
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new LinkedHashSet<>();
		// START find duplicate elements in a given integers list in java using Stream functions.
		myList
		.stream()
		.filter(s -> !set.add(s));
		//.forEach(System.out::println);
		
		// END find duplicate elements in a given integers list in java using Stream functions?
	}

}
