package immutableExample;

public class ImmutableTest {

	public static void main(String[] args) {
		 Age age = new Age();
		    age.setDay(1);
		    age.setMonth(1);
		    age.setYear(1992);
		    ImmutableStudent student = new ImmutableStudent(1, "Alex", age);

			/*
			 * System.out.println("Alex age year before modification = " +
			 * student.getAge().getYear()); age.setYear(1993);
			 * System.out.println("Alex age year after modification = " +
			 * student.getAge().getYear());
			 */
		    
		    //However, our class still has a leak and is not fully immutable, let’s take the following test scenario:
		    
		    System.out.println("Alex age year before modification = " + student.getAge().getYear());
		    student.getAge().setYear(1993);
		    System.out.println("Alex age year after modification = " + student.getAge().getYear());
		    
		    

	}

}
