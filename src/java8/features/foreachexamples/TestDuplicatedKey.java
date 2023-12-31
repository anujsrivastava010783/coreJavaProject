package java8.features.foreachexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestDuplicatedKey {

	public static void main(String[] args) {
		 List<Hosting> list = new ArrayList<>();
	        list.add(new Hosting(1, "liquidweb.com", 80000));
	        list.add(new Hosting(2, "linode.com", 90000));
	        list.add(new Hosting(3, "digitalocean.com", 120000));
	        list.add(new Hosting(4, "aws.amazon.com", 200000));
	        list.add(new Hosting(5, "mkyong.com", 1));
			
	        list.add(new Hosting(6, "linode.com", 100000)); // new line
	        
	     // key = name, value - websites , but the key 'linode' is duplicated!?
	     // (oldValue, newValue) -> oldValue ==> If the key is duplicated, do you prefer oldKey or newKey?
	    Map<String,Long>  result = list.stream().collect(Collectors.toMap(Hosting:: getName, Hosting:: getWebsites,(oldValue, newValue) -> oldValue));
	    System.out.println(result);
	}

}
