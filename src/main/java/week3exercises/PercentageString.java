package week3exercises;

import java.util.Scanner;



public class PercentageString {

	public static void main(String[] args) {
		//Get the string value as "Tiger Runs @ The SpeedOf100km/hours.", from the user
		Scanner samp = new Scanner(System.in);
		System.out.println("Enter the string value:");
		String word = samp.next();
		char[] charArray = word.toCharArray();
		int upper = 0;
	      int lower = 0;
	      int digit = 0;
	      int others = 0;
	      int totalChars = word.length();
	      for(int i=0; i<word.length(); i++) {
	          if (Character.isUpperCase(charArray[i])) {
	             upper++;
	          } else if(Character.isLowerCase(charArray[i])) {
	             lower++;
	          } else if(Character.isDigit(charArray[i])){
	             digit++;
	          } else {
	             others++;
	          }
	       }
	       System.out.println("Total length of the string :"+totalChars);
	       System.out.println("Upper case :"+upper);
	       System.out.println("Percentage of upper case letters: "+(upper*100)/totalChars);
	       System.out.println("Lower case :"+lower);
	       System.out.println("Percentage of lower case letters:"+(lower*100)/totalChars);
	       System.out.println("Digit :"+digit);
	       System.out.println("Percentage of digits :"+(digit*100)/totalChars);
	       System.out.println("Others :"+others);
	       System.out.println("Percentage of other characters :"+(others*100)/totalChars);
	}
	}

