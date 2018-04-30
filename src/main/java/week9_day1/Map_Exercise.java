package week9_day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class Map_Exercise {

	public static void main(String[] args) {
		
		String text = "will i succeed in interview";
		
		char[] a = text.toCharArray();
		
		HashMap<Character, Integer> values = new HashMap<>();
		
		for(char c : a)
		{
	       if(values.containsKey(c))
	       {
	    	   values.put(c, values.get(c)+1);
	       }
	       else
	       {
	    	   values.put(c,1);
	       }
	    	   
		}
		
		System.out.println(values);
		
		for(Entry<Character, Integer> ent : values.entrySet())
		{
			//if(ent.getKey()=='w')
			if(ent.getValue()==1)
			{
				System.out.println(ent);
			}
		}
		
		

	}

}
