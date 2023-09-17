package java8.features.consumersexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		// implementation of the Consumer's accept methods.
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        list.forEach(consumer);
        
     // or call this directly
        forEach(list, (x) -> System.out.println(x));
	}
	
	static  void forEach(List<Integer> list, Consumer<Integer> consumer) {
        for (Integer obj : list) {
            consumer.accept(obj);
        }
    }

}
