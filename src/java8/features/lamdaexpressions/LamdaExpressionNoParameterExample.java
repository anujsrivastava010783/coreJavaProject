package java8.features.lamdaexpressions;

public class LamdaExpressionNoParameterExample {

	public static void main(String[] args) {
		Sayable s = () -> {
			return "Hello";
		};
		
		System.out.println(s.say());
	}

}

interface Sayable{  
    public String say();  
}  
