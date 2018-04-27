package week7_exercises;

import java.util.regex.Pattern;

public class ExactMatch {

	public static void main(String[] args) {
		
		
      
       // Regular expression in java to check if String is 5 digit number or not
       String [] numbers = {"12345", "123456" , "123.45"};
       Pattern digitPattern = Pattern.compile("\\d{5}");       
       //Pattern digitPattern = Pattern.compile("\\d\\d\\d\\d\\d\\d");
       

       for(String number: numbers){
           System.out.println( "does " + number + " is 5 digit number : "
                               + digitPattern.matcher(number).matches());
       }
    }
}



	
