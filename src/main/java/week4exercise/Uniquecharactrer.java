package week4exercise;

import java.util.Scanner;

public class Uniquecharactrer {

	public static void main(String[] args) {
		//Get the string characters from the users
		Scanner samp = new Scanner(System.in);
		//Initialize the string variables
		String word=" ";
		System.out.println("Enter the string");
		//Get the input
		word = samp.nextLine();
		String unique=" ";
		//Use for loop to get unique character
		for (int i = 0; i < word.length(); i++){
            if (unique.indexOf(word.charAt(i)) == - 1){
            	unique = unique + word.charAt(i);
         }
            
      }

    System.out.println(unique + " ");
	    }

	    
	}


