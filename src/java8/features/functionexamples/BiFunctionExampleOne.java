package java8.features.functionexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExampleOne {

	public static void main(String[] args) {
		
		// takes two Integers and return an Integer
		BiFunction<Integer, Integer, Integer> func = (x1,x2) -> x1 + x2;
		
		Integer result1 = func.apply(2, 3);
		
		System.out.println("Result 1 : " +result1);// 5
		
		// take two Integers and return an Double
		BiFunction<Integer, Integer, Double> func2 = (x1 , x2) -> Math.pow(x1, x2);
		
		Double result2 = func2.apply(2, 4);
		
		System.out.println("Result 2:"+ result2);// 16.0
		
		// take two Integers and return a List<Integer>
		
		BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1+x2);
		
		List<Integer> list = func3.apply(2,3);
		
		System.out.println("Result 3: " + list);

	}

}
