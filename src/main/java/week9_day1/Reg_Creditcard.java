package week9_day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Reg_Creditcard {
	
	public static void main(String[] args)
	{
		
		String txt = "1111-2222-3333-4444";
		String patt = "\\d{4}\\W{1}\\d{4}\\W{1}\\d{4}\\W{1}\\d{4}";
		
		String txt1="prasanth.sundaresan@gmail.com";
		String patt1 = "\\w{1,}.\\D{1,}.\\D{1,}";
		Pattern p = Pattern.compile(patt);
		Matcher m = p.matcher(txt);
		System.out.println(m.matches());
		System.out.println(m.matches());
		
		/*while(m.find())
		{
			System.out.println(m.group());
		}*/
				
		
	}

}
