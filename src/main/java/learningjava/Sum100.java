package learningjava;

public class Sum100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for(int i=1;i<=10;i++)
		{
			//reminder = i%10;
			sum = sum+i;
			//i=i/10;
				
		}
		System.out.println("sum of digits results" +sum);
	}

}
