package learningjava;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 2nd Multiplication table - 1*2 = 2
		                              2*2 = 4
		                              3*2 = 6
		*/
		
		int n=2;
		
		for (int i=1;i<=10;i++)
		
		{
			System.out.println(i+"*"+n+" = "+(i*n));
		}
		
		int o=2;
		int j=1;
		while(j<=10)
		{
			System.out.println(j+"*"+o+" = "+(j*o));
			j=j+1;
		}
	

}
}