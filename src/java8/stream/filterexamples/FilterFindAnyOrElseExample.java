package java8.stream.filterexamples;

import java.util.Arrays;
import java.util.List;

public class FilterFindAnyOrElseExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("mkyong", 30),
                								new Person("jack", 20),
                								new Person("lawrence", 40));

		Person person = persons.stream().filter(x -> "jack".equals(x.getName()) && 20 == x.getAge()).findAny().orElse(null);
			System.out.print(person);
			
		Person anotherPerson =	persons.stream().filter(x -> x.getName().equals("Anuj")).findAny().orElse(null);
		System.out.println(anotherPerson);
	}

}
