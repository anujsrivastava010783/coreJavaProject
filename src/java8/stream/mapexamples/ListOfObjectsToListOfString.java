package java8.stream.mapexamples;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfObjectsToListOfString {

	public static void main(String[] args) {
		 List<Staff> staff = Arrays.asList(
	                new Staff("mkyong", 30, new BigDecimal(10000)),
	                new Staff("jack", 27, new BigDecimal(20000)),
	                new Staff("lawrence", 33, new BigDecimal(30000))
	        );
		 staff.stream().map(Staff::getName).collect(Collectors.toList()).forEach(System.out::println);
	}
}
