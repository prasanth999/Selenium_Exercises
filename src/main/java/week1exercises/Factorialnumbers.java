package week1exercises;

import java.util.Scanner;

public class Factorialnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner samp = new Scanner(System.in);
		 System.out.println("Enter the factorial numbers");
		 int numb = samp.nextInt();
		 int fact=1;
		 if(numb<0)
		 {
			 System.out.println("Number should be in Postive integer");
			 
		 }
		 
		 else
		 {
		 for (int i=1;i<=numb;i++){
			 fact=fact*i;
			 //print the factoiral number
			  }
		 System.out.println("Factorial number of "+ numb + " is " +fact);
	}
	}
}
