package learningjava;

public class Day1understandingoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numb1=5;
		int numb2=3;
		boolean flag=true;
		
		System.out.println(numb1++);
		System.out.println(numb1);
		System.out.println(++numb1);
		System.out.println(numb2--);
		System.out.println(numb2);
		System.out.println(--numb2);
		System.out.println(flag);
		System.out.println(!flag);
		int a=10;
		int b=13;
		int c=19;
		
		System.out.println(a>b||a<c);//true || true = true  
		System.out.println(a>b|a<c);//true | true = true  
		//|| vs |  
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked
		if(a>b && a>c)
			System.out.println("A is greater");
		else
			if (b>c)
			System.out.println("b is greater");
			else
			System.out.println("c is greater");
        //if(numb1==5 || flag)
        	
		 System.out.println(20>>2);  
		    System.out.println(20>>>2);  
		    System.out.println(20<<2);  
		    //System.out.println(20<<<2);  
	}

}
