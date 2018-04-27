package week3exercises;

import java.util.Scanner;

public class Mulitples {

	public static void main(String[] args) {
		//Get the user input that sum of all multiples of 3 or 5
		Scanner samp = new Scanner(System.in);
		System.out.println("Enter the sum of all multiples of 3 or 5 numbers");
		int limit = samp.nextInt();
		//Initialize the integer variable
		int sum=0;
		//for loop 
		for (int i=1;i<limit;i++)
		{
			//check the given number is divisible by 3 0r 5
			if((i%3==0) || (i%5==0))
			{
				//calculate the sum of all mulitiples of 3 or 5
				sum = sum+i;
			}
		}
		//print the sum of values
		System.out.println("Result" + sum);
	}

}
