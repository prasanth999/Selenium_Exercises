package learningjava;

import java.util.Scanner;

public class Inputtwodimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array values");
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array result displayed");
		
		for (int k=0;k<a.length;k++)
		{
			for (int l=0;l<a[k].length;l++)
			{
				System.out.print(a[k][l]);
				System.out.print("  ");
			}
			System.out.println();
			
	}

}
}