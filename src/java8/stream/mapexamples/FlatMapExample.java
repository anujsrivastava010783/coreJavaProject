package java8.stream.mapexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {
		
		/*
		 * String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		 * Stream<String[]> stream1= Arrays.stream(array); List<String[]> result =
		 * stream1.filter(x-> !x.equals("a")).collect(Collectors.toList());
		 * //System.out.println(result.size()); // 0 //result.forEach(x ->
		 * System.out.println(x.toString()); List<String[]> result1 =
		 * Arrays.stream(array).filter(x -> { for(String s : x){ // really?
		 * if(s.equals("a")){ return false; } } return true;
		 * }).collect(Collectors.toList()); // print array result1.forEach(x ->
		 * System.out.println(Arrays.toString(x)));
		 */
		 
		
		String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		List<String> result=Stream.of(array)// Stream<String[]>
				                      .flatMap(Stream::of)// Stream<String>
				                      .filter(x -> !x.equals("a"))// filter out the a
				                      .collect(Collectors.toList());// return a List
		result.forEach(System.out::println);
		
	}

}
