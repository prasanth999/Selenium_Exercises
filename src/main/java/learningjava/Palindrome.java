package learningjava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,sum=0,temp;    
		  //int n=454;//It is the number variable to be checked for palindrome  
		  Scanner test1 = new Scanner(System.in);
		  System.out.println("Enter your number"); 
		  int n = test1.nextInt();
		  test1.close();
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("Given number is palindrome number ");    
		  else    
		   System.out.println("Given number is not palindrome number");   
		
	}

}
