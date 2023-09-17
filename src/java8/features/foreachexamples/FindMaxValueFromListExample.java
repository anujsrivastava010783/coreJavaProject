package java8.features.foreachexamples;

import java.util.Arrays;
import java.util.List;

public class FindMaxValueFromListExample {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		int max = myList.stream().max((a,b)-> a.compareTo(b)).get();
		System.out.println("Maximum value is : "+max);
		
		int min = myList.stream().min(Integer :: compareTo).get();
		System.out.println("Minimum value is : "+min);
	}
}
