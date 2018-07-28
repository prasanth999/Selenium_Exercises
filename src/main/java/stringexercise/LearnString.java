package stringexercise;
import java.util.Arrays;

public class LearnString {

	//http://www.vogella.com/tutorials/JavaRegularExpressions/article.html - for regex
	
	public static void main(String args[]) {
		String str1 = "Learn Java - Selenium";
		String str2 = new String("Learn Java - Selenium");
		String str3 = "Learn Java - Selenium";
		String str4 = "Learn Java - Selenium";
		String str6 = "    Learn Java - Selenium      ";
		String str5 = new String("Java");
		String str7 = new String("Kava");
		String str8 = new String("jaVa");
		String str9 = new String("");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str3==str4);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str4.contains(str5));
		
		char[] cArr = str4.toCharArray();
		
		System.out.println(Arrays.toString(cArr));
		
		String[] sArr = str4.split("Java");
		
		System.out.println(Arrays.toString(sArr));
		
		System.out.println(str4.length());
		
		System.out.println(str4.substring(4));
		System.out.println(str4.substring(4,18));
		
		System.out.println(str4.charAt(4));
		
		System.out.println(str4.indexOf("Java"));
		
		System.out.println(str4.replaceFirst("a","e"));
		System.out.println(str6.trim());
		
		System.out.println(str7.compareTo(str5));
		
		System.out.println(str5.equalsIgnoreCase(str8));
		System.out.println(str9.isEmpty());
		
		String num = "1234dvewvew";
		
		int a = Integer.parseInt(num);
		System.out.println(a);
		int b  = 1234;
		String bStr = ""+1234;
		String bStr1 = Integer.toString(b);
		
		System.out.println(bStr +" "+bStr1);
		
	}
}