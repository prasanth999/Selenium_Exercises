package week6exercise;

public class ReplaceMultiSpacesWithSingleSpace {

	public static void main(String[] args) {
		//Get the value of the string
		String string = "aa   bbbbbb     ccc  dd";
		//print the input value of the string
        System.out.println("Original String : "+string);
        //Remove the multiple space and replace with single space
        System.out.println("Resulting String : "+string.replaceAll("\\s+", " "));
    

	}

}
