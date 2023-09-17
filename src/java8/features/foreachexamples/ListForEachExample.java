package java8.features.foreachexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListForEachExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
	      list.add("A");
	      list.add("B");
	      list.add(null);
	      list.add("D");
	      list.add("E");
	      
			/*
			 * list.stream() .filter(Objects :: nonNull) .forEach(System.out::println);
			 */
	      
	      list.stream().filter(x -> {
	    	  if(null!=x) {
	    		  return true;
	    	  }
	    	  return false;
	      }).forEach(System.out::println);

	}

}
