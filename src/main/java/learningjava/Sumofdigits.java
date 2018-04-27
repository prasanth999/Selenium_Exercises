package learningjava;

public class Sumofdigits {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inputNumber=432;int reminder;int sum=0;
		int number = inputNumber;
		while (inputNumber !=0)
			
		{
			reminder = inputNumber%10;
			sum = sum + reminder;
			//inputNumber = quotient;
			inputNumber = inputNumber/10;
		}
		
		System.out.println("sum of digits" +number + "results" +sum);
	}

}
