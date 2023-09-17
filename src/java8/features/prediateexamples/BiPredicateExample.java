package java8.features.prediateexamples;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		
		BiPredicate<String,Integer> filter = (x,y) ->{
			return x.length() == y ;
		};
		boolean result = filter.test("mykong", 6);
		
		System.out.println(result);
		
		boolean result2 = filter.test("java", 10);
		
		System.out.println(result2);
	}

}
