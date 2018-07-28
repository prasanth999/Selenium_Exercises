package week10;



import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class SortMap {
	
	
	public static void main(String[] args) {
		
		
		Map<Integer, String>  numbers = new LinkedHashMap<Integer, String>();
		
		
		numbers.put(1,"one");
		numbers.put(17,"seventeen");
		numbers.put(12,"twelve");
		numbers.put(5,"five");
		numbers.put(2,"two");
		numbers.put(25,"twenty five");
		
		// Print the name of all mentors -- you will notice the order in the map maintained
		for (Entry<Integer, String> mentor : numbers.entrySet()) {
			
			System.out.println("The key is: "+mentor.getKey()+""
					+ " and value is: "+mentor.getValue()); 			
		}
		
		numbers.putAll(numbers);
		
		
		
		
	}

}
