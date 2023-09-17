package java8.features;

import java.util.Arrays;

public class ReduceExamples {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = Arrays.stream(numbers).reduce(0,(a,b) -> a+b);
		int subtraction = Arrays.stream(numbers).reduce(0,(a,b) -> a-b);
		int multiplication = Arrays.stream(numbers).reduce(0,(a,b) -> a*b);
		System.out.println(sum);
		System.out.println(subtraction);
		System.out.println(multiplication);
		int max = Arrays.stream(numbers).reduce(0,(a,b)-> a>b?a :b);
		int max1 = Arrays.stream(numbers).reduce(0,Integer :: max);
		System.out.println(max);
		System.out.println(max1);
		int min = Arrays.stream(numbers).reduce(0,(a,b)-> a<b?a :b);
		int min1 = Arrays.stream(numbers).reduce(1,Integer :: min);
		System.out.println(min);
		System.out.println(min1);
	}

}
