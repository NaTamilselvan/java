package com.tamil.package1;

import java.util.Scanner;

  /**
 *   In java there types of exceptions handled 
 *   1.)exceptions is occur inside a method handled inside a method
 *   2.)re throwing exceptions use in try catch and throw throws and finally  
 *   3.)ducking exceptions 
 */
class Fun1{
	
	public void fun() throws Exception {
		
		try {
			
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter the numerator");
		 
		 
		 int a=scan.nextInt();
		 
		 
		 System.out.println("Enter the dinaminator");
		 
		 int b=scan.nextInt();
		 
		 int c=a/b;
		 }
		 catch(ArithmeticException ae) {
			 
			 System.out.println("check our divisor ");
			 throw ae;
		 }
		 catch(Exception e) {
			 System.out.println("The exceptions is handled is inside a method");
			 //throw e;
		 }
		finally {
	       System.out.println("connection is terminated ");	 
		}
	}
}



public class Test4{

	public static void main(String[] args)  {
		    
		Fun1 f=new Fun1();

		try {
		f.fun();
		}
     catch(Exception e) {
        	 System.out.println("The exceptions is handles in main");
         }	 
         
	}

}

