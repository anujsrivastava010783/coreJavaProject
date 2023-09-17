package java8.features.lamdaexpressions;

public class LamdaExpressionSingleParameterExample {

	public static void main(String[] args) {
		/*
		 * Temp s = (name) ->{ return "Hello "+name; };
		 * 
		 * System.out.println(s.say("Anuj"));
		 */
		
		Temp s = (name) -> {
			String str = "I would like to say that ";
			String str2 = str + name;
			return str2;
		};
		System.out.println(s.say("time is precious"));
	}

}

@FunctionalInterface
interface Temp{  
    public String say(String name);  
}  
