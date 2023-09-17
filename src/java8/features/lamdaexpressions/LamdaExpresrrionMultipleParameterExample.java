package java8.features.lamdaexpressions;

public class LamdaExpresrrionMultipleParameterExample {

	public static void main(String[] args) {
		Addable ad1 = (a,b) -> (a+b);
		
		System.out.println(ad1.add(10, 5));
		
		// Multiple parameters with data type in lambda expression  
		
		Addable ad2 = (int a, int b) -> {
			return a+b;
		};
		System.out.println(ad2.add(100, 200));
	}

}

@FunctionalInterface
interface Addable{  
    int add(int a,int b);  
} 