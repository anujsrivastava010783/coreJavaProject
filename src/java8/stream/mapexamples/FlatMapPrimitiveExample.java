package java8.stream.mapexamples;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapPrimitiveExample {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5,6};
		
		Stream<int[]> stream = Stream.of(intArray);
		
		//Stream<int[]> -> flatMap -> IntStream
		IntStream intStream = stream .flatMapToInt(x-> Arrays.stream(x));
		int sum = intStream.reduce(0, (a,b) -> a+b);
		//System.out.print(sum);
		 int sum1 = Arrays.stream(intArray).reduce(0, (a, b) -> a + b);
		 System.out.print(sum1);
		 int sum2 = Arrays.stream(intArray).reduce(0, Integer :: sum);
		 System.out.print(sum2);
		
	}

}
