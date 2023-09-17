package java8.stream.mapexamples;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfObjectsToListOfOtherObjects {
	
	public static void main(String[] a) {
		
		List<Staff> staff = Arrays.asList(
                new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000)),
                new Staff("lawrence", 33, new BigDecimal(30000))
        );	
		
		staff.stream().map(temp -> {
			StaffPublic st = new StaffPublic();
			st.setName(temp.getName());
			st.setAge(temp.getAge());
			if ("mkyong".equals(temp.getName())) {
                st.setExtra("this field is for mkyong only!");
            }
			return st;
		}).collect(Collectors.toList()).forEach(System.out::println);;
	}

}
