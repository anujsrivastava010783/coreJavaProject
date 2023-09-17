package java8.features.foreachexamples;

import java.util.HashMap;
import java.util.Map;

public class MapForEachExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
	      map.put("A", 10);
	      map.put("B", 20);
	      map.put("C", 30);
	      map.put(null, 40);
	      map.put("E", null);
	      map.put("F", 60);

	      // ensure map is not null
	      if (map != null) {
	          map.forEach((k,v) -> System.out.println("Key: "+ k + " Value : " +v));
	          System.out.println("Removing null keys");
	          map.forEach((k,v)->{
	        	  // ensure map key is not null
	        	  if(k!=null)
	        		  System.out.println("Key: "+ k + " Value : " +v);
	        	  
	          });
	      }
	}

}
