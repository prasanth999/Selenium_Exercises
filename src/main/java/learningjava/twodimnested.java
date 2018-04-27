package learningjava;

public class twodimnested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String details[][] = {{"sam","O"},{"sam","O"},{"sam","O"},{"sam","O"}};
System.out.println("name" + " " + "group");
System.out.println("-------------------");
		for(int i=0;i<=3;i++)
		{
			
			for (int j=0;j<2;j++)
			{
				//System.out.print(" ");
				System.out.print(details[i][j]+"  ");
				
		}
			System.out.println();
			
		}
	
		
	}

}
