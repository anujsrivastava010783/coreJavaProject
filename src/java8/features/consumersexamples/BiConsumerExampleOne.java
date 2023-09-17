package java8.features.consumersexamples;

import java.util.function.BiConsumer;

public class BiConsumerExampleOne {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = (x,y)-> System.out.println(x+y);
		//biConsumer.accept(1,2);
		BiConsumer<String, String> biConsumer2 = (x,y)-> System.out.println(x+y);
		//biConsumer2.accept("Node", ".js");
		addTwoStr("Node", ".js",(x,y)-> System.out.println(x+y));
		// biConsumer as an argument
		//addTwo(1,2,(x,y) -> System.out.println(x+y));
	}
	
	public static void addTwo(Integer x, Integer y, BiConsumer<Integer, Integer> biConsumer) {
		biConsumer.accept(x,y);
	}
	
	public static void addTwoStr(String x, String y, BiConsumer<String, String> biConsumer) {
		biConsumer.accept(x,y);
	}

}
