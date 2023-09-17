package java8.features.functionexamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionListToMapExample {

	public static void main(String[] args) {

		// This example accepts Function as an argument, convert a List into a Map.
		FunctionListToMapExample obj = new FunctionListToMapExample();
		List<String> list = Arrays.asList("node", "c++", "java", "javascript");
		Map<String, Integer> map =  convertListToMap(list, x -> x.length());
		
		System.out.println(map);
	}
	
	public static Map<String, Integer> convertListToMap(List<String> list, Function<String,Integer> func){
		Map<String, Integer> result = new HashMap<>();
		list.forEach(x ->{
			result.put(x, func.apply(x));
		});
		return result;
	}
}
