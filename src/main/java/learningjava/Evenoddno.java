package learningjava;

public class Evenoddno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		//int reminder=0;
		System.out.println("Even number");
		for (int i=1;i<100;i++)
			
		{
			
		if(i%2==0)
		{
		System.out.println(i);
		
		}
		}
		System.out.println("odd number");
		for (int j=1;j<100;j++) {
			if(j%2==1)
			{
				System.out.println(j);
					
			}
		}
		
		System.out.println("divisible by 5");
		for (int k=1;k<100;k++) {
			if(k%5==0)
			{
				System.out.println(k);
					
			}
		}
	}

}
