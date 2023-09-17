package java8.features.consumersexamples;

import java.util.function.Consumer;

public class ConsumerExampleOne {

	public static void main(String[] args) {
		
		Consumer<String> print = x -> System.out.println(x);
		
		print.accept("java");// java

	}

}
