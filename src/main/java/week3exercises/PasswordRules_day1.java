package week3exercises;

import java.util.Scanner;

public class PasswordRules_day1 {

	public static void main(String[] args) {
		//Get the input from the user
		Scanner samp = new Scanner(System.in);
		System.out.println("Enter the Password:");
		String password = samp.next();
		//Check the password is valid or not
		if (isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean isValid(String password) {
    	//Check the password must have atleast 10 character
        if (password.length() < 10) { 
            return false;
        } else {    
            char c;
            int count = 1; 
            for (int i = 0; i < password.length() - 1; i++) {
                c = password.charAt(i);
                //Password contains letter or digits
                if (!Character.isLetterOrDigit(c)) {        
                    return false;
                } 
              //Password contains 2 letter or 2 digits 
                else if (Character.isLetterOrDigit(c)) {
                    count++;
                    if (count < 2)   {   
                        return false;
                    }  
                    
                    //password must contains one capital letter
                    else if (!Character.isUpperCase(c))
                    {
                    	count++;
                        if (count < 1)   {   
                            return false;
                        }                }
            }
        }
        return true;
		
        }
    }
	}
