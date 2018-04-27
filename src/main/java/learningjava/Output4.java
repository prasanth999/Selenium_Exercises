package learningjava;

public class Output4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr1[] = new String [3];
		String arr2[] = new String [3];

		arr1[0]="A";
		arr1[1]="B";
		arr1[2]="C";

		arr2[0]="1";
		arr2[1]="2";
		arr2[2]="3";
		printAll(arr2);
		printAll(arr1);

		}

		public static void printAll(String str[]){
		for(int i=0; i < str.length ; i++){
		System.out.println(str[i]);
		}

	}

}
