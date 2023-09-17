package java8.features.prediateexamples;

import java.util.function.Predicate;

public class PredicateChainingExample {

	public static void main(String[] args) {
		
		Predicate<String> startWithA = x -> x.startsWith("a");
		
		// start with "a" or "m"
		boolean result1 = startWithA.or(x -> x.startsWith("m")).test("mykong");
		System.out.println(result1);
		 // !(start with "a" and length is 3)
		boolean result2 = startWithA.and(x -> x.length()==3).negate().test("abc");
		System.out.println(result2);
	}
}
