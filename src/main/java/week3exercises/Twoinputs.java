package week3exercises;

import java.util.Scanner;

public class Twoinputs {

	public static void main(String[] args) {
		//Get the input frm the users
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = scan.nextInt();
		System.out.println("Enter the Target number to be not not present:");
		int targetNum = scan.nextInt();
		int temp = 0;
		int temp2 =0;
		do{
		int count =0;
		number=number-1;
		temp2 = number;
		do{
		temp = temp2%10;

		temp2 = (temp2-temp)/10;

		if(temp==targetNum)
		{
		count=count-1;
		}
		}while(temp2!=0);
		if(count==0)
		{
		System.out.println(number);
		break;
		}
		}while(number!=0);
		}
		}

