package java8.features.prediateexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateFunctionArgumentExample {

	public static void main(String[] args) {
		
		List<Domain> domains = Arrays.asList(new Domain("google.com", 1),
                new Domain("i-am-spammer.com", 10),
                new Domain("mkyong.com", 0),
                new Domain("microsoft.com", 2));
		
		BiPredicate<String,Integer> biPredicate = (domain,score)->{
			return (domain.equalsIgnoreCase("google.com")|| score == 0);
		};
		 // if google.com or score == 0
		 List<Domain> result = filterBadDomain(domains,biPredicate);
		 System.out.println(result);
		
		 // score == 0
		 List<Domain> result2 = filterBadDomain(domains,(domain, score) -> score == 0);
		 System.out.println(result2);
		 
		// if start with i or score > 5
		 List<Domain> result3 = filterBadDomain(domains,(domain, score) -> domain.startsWith("i")&& score > 5);
		 System.out.println(result3);
		 
		// chaining with or
		 
		 List<Domain> result4 = filterBadDomain(domains,biPredicate.or((domain,y)-> domain.equalsIgnoreCase("microsoft.com")));
		 System.out.println(result4);
	}
	
	public static List<Domain> filterBadDomain(List<Domain> domains, BiPredicate<String,Integer> biPredicate) {
		
		return domains.stream().filter(x -> biPredicate.test(x.getName(), x.getScore())).collect(Collectors.toList());
		
	}

}
