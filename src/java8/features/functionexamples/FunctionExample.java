package java8.features.functionexamples;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		// This example takes a <T> String and returns the length of the string as <R> Integer.
		Function<String,Integer> func = x -> x.length();
		
		Integer result = func.apply("Anuj");
		System.out.println(result);
		
	}
}
