package learningjava;

import java.util.Scanner;

public class Inputsingledimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array");
		
		for (int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements list are");
		
		for (int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);		
			
		}
		
	}

}
