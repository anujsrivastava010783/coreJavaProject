package java8.stream.filterexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("mkyong", 30),
				new Person("jack", 20),
				new Person("lawrence", 40));
		
		List<String> names = persons.stream().filter(x -> x.getName().equals("jack")).map(Person::getName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		//System.out.println( persons.stream().map(Person::getName));
		
	}

}
