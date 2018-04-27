package learningjava;

public class Printno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j <= i) {
                    System.out.print("  1");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
		
		}
		
	}


