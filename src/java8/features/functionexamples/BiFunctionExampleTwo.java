package java8.features.functionexamples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExampleTwo {

	public static void main(String[] args) {

		// Math.pow(a1, a2) returns Double
		BiFunction<Integer, Integer, Double> func1 = (x1, x2) -> Math.pow(x1, x2);

		// takes Double, returns String
		Function<Double, String> func2 = (input) -> "Result: " + String.valueOf(input);

		Function<String, String> func3 = x1 -> "Hello:" + x1;

		String result = func1.andThen(func2).apply(2, 4);

		// System.out.println(result);

		//This example converts the above program into a method that accepts BiFunction and Function as arguments and chains it together.
		String result2 = powToString(2, 4, (a1, a2) -> Math.pow(a1, a2), (r) -> "Result : " + String.valueOf(r));

		System.out.println(result2); // Result : 16.0

	}

	public static String powToString(Integer a1, Integer a2, BiFunction<Integer, Integer, Double> func,
			Function<Double, String> func2) {

		return func.andThen(func2).apply(a1, a2);

	}

}
