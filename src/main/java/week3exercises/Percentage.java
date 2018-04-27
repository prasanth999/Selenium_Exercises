package week3exercises;

public class Percentage {

	public static void main(String[] args) {
// Initialize the string values as Tiger Runs @ The SpeedOf100km/hours.
		String data = "Tiger Runs @ The SpeedOf100km/hours.";
		//Initialize the character array
		char [] charArray = data.toCharArray();
		//Inititalize the integer values for upper , lower , digits and others
		int upper = 0;
		int lower = 0;
		int digit = 0;
		int others = 0;
// Assign the data.length to totalchars
		int totalChars = data.length();
		//use forloop to get the length of string
		//Also check the if character is uppercase , lowercase,digits,others
		for(int i=0; i<data.length(); i++) {
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
		//Print the uppercase , lowercase,digits,others
		// Print the percentage of uppercase , lowercase,digits,others
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
