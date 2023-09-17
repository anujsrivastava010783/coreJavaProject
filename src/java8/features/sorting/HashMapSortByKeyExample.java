package java8.features.sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSortByKeyExample {

	public static void main(String[] args) {
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println("Original...");
        System.out.println(unsortMap);
        
      Map<String, Integer> sortedMapByKey =  unsortMap
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey())
        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue,newValue)->oldValue, LinkedHashMap:: new));
        
        System.out.println("Sorted..by key.");
       
        System.out.println(sortedMapByKey);
        
        Map<String, Integer> sortedMapByValue =  unsortMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue,newValue)->oldValue, LinkedHashMap:: new));
                
                System.out.println("Sorted..by value.");
                System.out.println(sortedMapByValue);
                
             // Alternative Way
                
                Map<String, Integer> map = new LinkedHashMap<>();
                
                 unsortMap.entrySet()
            		   .stream().sorted()//Map.Entry.comparingByValue(Comparator.reverseOrder())
            		   .forEachOrdered(x -> map.put(x.getKey(),x.getValue()));
                 
                 System.out.println("Sorted..by value in decreasing order.");
                 System.out.println(map);
                 
                 
	}

}
