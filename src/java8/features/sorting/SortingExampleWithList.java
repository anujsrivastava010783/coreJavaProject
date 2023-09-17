package java8.features.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExampleWithList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
		/* 
		List<String> sortedList = list.stream()
			.sorted(Comparator.naturalOrder())
			.collect(Collectors.toList());
			
        List<String> sortedList = list.stream()
			.sorted((o1,o2)-> o1.compareTo(o2))
			.collect(Collectors.toList());
		*/
		
		List<String> sortedList= list.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		
		//Sorted the list with increasing order
		/*
		List<String> sortedList = list.stream()
			.sorted((o1,o2)-> o2.compareTo(o1))
			.collect(Collectors.toList());
		*/
		
		System.out.println("==============================");
		List<Integer> integerList = Arrays.asList(1,3,5,9,2,6,8,7);
		//integerList.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

		//Sorted the list with decreasing order
		integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
	}

}
