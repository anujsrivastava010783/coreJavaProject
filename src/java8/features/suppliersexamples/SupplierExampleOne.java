package java8.features.suppliersexamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierExampleOne {
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {
		
		Supplier<LocalDateTime> supplier = ()-> LocalDateTime.now();
		LocalDateTime time = supplier.get();
		
		System.out.println(time);
		
		Supplier<String> supplier1 = ()-> dtf.format(LocalDateTime.now());
		String time1 = supplier1.get();
		
		System.out.println(time1);

		
		

		
	}

}
