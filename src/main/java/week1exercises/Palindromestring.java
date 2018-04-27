package week1exercises;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		 //Initialize the Data type , variables and values - 
		// Using scanner get the value of Palindrome string
		 Scanner samp = new Scanner(System.in);
		 System.out.println("Enter the Palindrome");
		 String palin = samp.next();
		 String reverse="";
		//Calculate the palindrome
		 int length = palin.length();
		for (int i = length-1;i>=0;i--)

		{

		reverse = reverse+palin.charAt(i);
		}
		//check the given string is palindrome or not
		if(reverse.equals(palin))

		System.out.println("Given string is palindrome");

		else

		System.out.println("Given string is not palindrome");



	}

}
