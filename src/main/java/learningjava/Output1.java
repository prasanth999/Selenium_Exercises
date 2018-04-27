package learningjava;

public class Output1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		f1(1);

		}

		public static void f1(int i)
		{
		f2(i+1);
		}

		public static void f2(int i)
		{
		f3(i+1);
		}

		public static void f3(int i)
		{
		System.out.println(i+3);
	}

}
