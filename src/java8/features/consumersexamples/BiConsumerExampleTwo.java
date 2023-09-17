package java8.features.consumersexamples;

import java.util.function.BiConsumer;

public class BiConsumerExampleTwo {

	public static void main(String[] args) {
		
		math(1,1, (x,y) -> System.out.println(x+y));
		math(1,1, (x,y) -> System.out.println(x-y));
		math(1,1, (x,y) -> System.out.println(x*y));
		math(1,1, (x,y) -> System.out.println(x/y));

	}
	
	public static void math(Integer x, Integer y, BiConsumer<Integer, Integer> biConsumer) {
		biConsumer.accept(x, y);
	}
}
