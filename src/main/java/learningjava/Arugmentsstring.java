package learningjava;

public class Arugmentsstring {
	
	static String name[] = {"Raj","kumar","mani","Ram"};
	String name1[] = {"Raj1","kumar1","mani1","Ram1"};
	int reg;
	static String details;
	
	public static void start()
	{
		System.out.println("Starting");
	}
	
	public void end()
	{
		System.out.println("ending");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arugmentsstring samp = new Arugmentsstring();
		samp.reg=10;
		samp.details="DVC";
		samp.start();
		samp.end();
		for (int i =0;i<=3;i++){
			{
				System.out.println(samp.name1[i]);
		System.out.println(name[i]);
			}
		//reg=10;
		details="BNM";
		
	}

}
}