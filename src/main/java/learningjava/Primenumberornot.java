package learningjava;

import java.util.Scanner;

public class Primenumberornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int reminder;
		Scanner sam = new Scanner(System.in);
		System.out.println("Enter the value");
		int numb = sam.nextInt();
		sam.close();
		
		for (int i=2;i<=numb;i++)
		{
			int reminder = numb%i;
			if (reminder==1)
			{
				System.out.println("Given number is prime");
				
				 break;
			}
			
			else
				if (reminder==0)
				{
				System.out.println("Given number is not prime");
				break;
		}
		}
			
	}

	}

