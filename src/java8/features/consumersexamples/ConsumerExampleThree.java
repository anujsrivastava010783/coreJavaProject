package java8.features.consumersexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExampleThree {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "ab", "abc");
		
		forEach(list, x -> System.out.println(x.length()));
	}
	
	public static void forEach (List<String> list, Consumer<String> consumer) {
		
		for (String str : list) {
			consumer.accept(str);
		}
		
	}

}
