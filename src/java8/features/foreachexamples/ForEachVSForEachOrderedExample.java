package java8.features.foreachexamples;

import java.util.stream.Stream;

public class ForEachVSForEachOrderedExample {

	public static void main(String[] args) {
		//The forEach does not guarantee the stream’s encounter order,
		//regardless of whether the stream is sequential or parallel. 
		// The result is obvious when run in a parallel mode.
		  Stream<String> s = Stream.of("a", "b", "c", "1", "2", "3");
		  s.parallel().forEach(x -> System.out.println(x));
		  System.out.println("=================================");
		  // The forEachOrdered guarantees the stream’s encounter order;
		  // thus, it sacrifices the benefit of parallelism.
		  Stream<String> s1 = Stream.of("a", "b", "c", "1", "2", "3");
		  s1.parallel().forEachOrdered(x -> System.out.println(x));
	}

}
