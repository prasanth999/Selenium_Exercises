package week2day2;

public class Repeatnumbers_7 {

	public static void main(String[] args) {
		int [] a = {13,15,67,88,65,67,13,13,99,67,65,13,87,13};
		System.out.print("Duplicate values are:");
		for (int i=0;i<=a.length-1;i++)

		{
			for (int j=i+1;j<a.length-1;j++)
			{

				if(a[i]==a[j] && (i!=j))
				{

					System.out.print(" " +a[i]);
				}
			}
		}

	}

}
