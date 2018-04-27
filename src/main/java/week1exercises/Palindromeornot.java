package week1exercises;

import java.util.Scanner;

public class Palindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,rem,quo,temp;
		Scanner pal = new Scanner(System.in);
		System.out.println("Enter the number");
		int numb = pal.nextInt();
		pal.close();
		
		temp=numb;
		while(numb>0)
		{
			rem = numb%10;
			sum = (sum*10)+rem;
			numb=numb/10;
			}
		
		if(temp==sum)
		
			System.out.println("Given number is palindrome");
		
		else
		
			System.out.println("Given number is not palindrome");
		
		}
		
		
	}
