package week7_exercises;

import java.util.Scanner; 
	public class PerfectNumber 
	{ 
	    public static void main(String args[]) 
	    { 
	        Scanner sl=new Scanner(System.in); 
	        System.out.println("Enter A Number"); 
	        int num=sl.nextInt(); 
	       
	        int b=1, s=0; 
	       
	        while(b<num ) 
	        { 
	            if(num%b == 0) 
	            { 
	                s += b; 
	              
	            } 
	            b++; 
	        } 
	       
	        if(s == num) 
	        { 
	            System.out.println(num+" is a perfect number"); 
	        } 
	       else 
	        { 
	           System.out.println(num+" is not a perfect number"); 
	        }       
	    } 
	} 


