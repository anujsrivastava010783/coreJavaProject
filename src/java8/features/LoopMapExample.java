package java8.features;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LoopMapExample {

	public static void main(String[] args) {
		Comparator c;
		Map<String, Integer> map = new HashMap<>();
	      map.put("A", 10);
	      map.put("B", 20);
	      map.put("C", 30);
	      map.put("D", 40);
	      map.put("E", 50);
	      map.put("F", 60);

	      // lambda
	      map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

	}

}
