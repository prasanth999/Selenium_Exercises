package week1exercises;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Get the integer values of 2 two number and 1 string
		Scanner samp = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a=samp.nextInt();
		System.out.println("Enter the second value");
		int b=samp.nextInt();
		String arithm;
		System.out.println("Enter the operation to perform - Add/Sub/Multiply/Divison");
		arithm=samp.next();
		int sum;
		switch(arithm)
		{
		case "Add":
		{
		sum=a+b;
		System.out.println("Addition is  " + sum);
		break;
		}
		case "Sub":
		{
		sum=a-b;
		System.out.println("Subtraction is " + sum);
		break;
		}
		case "Multiply":
		{
		sum=a*b;
		System.out.println("Multiplication is " + sum);
		break;
		}
		case "Divison":
		{
		sum=a/b;
		System.out.println("Divison is " + sum);
		break;
		}
		default:
		{
		System.out.println("Invalid Arithmentic operations");

		}



		}
	}
}


