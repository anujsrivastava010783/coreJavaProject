package java8.features.lamdaexpressions;

public class LamdaExpressionExample {

	public static void main(String[] args) {
		 int width=10;  
         
		 Drawable d = () -> {
			 System.out.println("Drawing  : "+width);
		 };
		 d.draw();
	}

}

interface Drawable{  
    public void draw();  
} 
