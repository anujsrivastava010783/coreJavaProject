package java8.features.functionexamples;

import java.util.function.Function;

public class ChainFunctionExample {

	public static void main(String[] args) {
		// This example chains the Function with andThen().
		Function<String, Integer> func = x -> x.length();
		
		Function<Integer, Integer> thenFunc = x -> x*2;
		
		Integer result = func.andThen(thenFunc).apply("Anuj");
		System.out.println(result);
	}

}
