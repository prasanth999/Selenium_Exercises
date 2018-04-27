package week8_day1;

public class Repeate {
	     
	public static void main(String[] args)  {
		
        String name = "prasanth ";
        char c='a';
        int count=0;
       
        for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==c) {
            	count++;
            }
        }
        System.out.println(count);
    }
}
