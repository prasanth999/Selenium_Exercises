package week8_day1;

import java.util.Scanner;

public class Append {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String output = " ";
		String txt=s.next();
		for (int i=0;i<txt.length();i++)
		{
			int x=txt.charAt(i);
			x=x+1;
			char c = (char)x;
			output = output.concat(c+"");
		}
		System.out.println(output);
		}

	}
