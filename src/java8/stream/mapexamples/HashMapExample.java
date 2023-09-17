package java8.stream.mapexamples;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<>();
		hm.put("A", null);
		System.out.println(hm);
		hm.put("A", "2");
		
		System.out.println(hm);

	}

}
