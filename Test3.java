package com.tamil.package1;

import java.util.Scanner;

  /**
 *   In java there types of exceptions handled 
 *   1.)exceptions is occur inside a method handled inside a method
 *   2.)re throwing exceptions use in try catch and throw throws and finally  
 *   3.)ducking exceptions 
 */
class Fun1{
	
	public void fun() {
		
		try {
			
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter the numerator");
		 
		 
		 int a=scan.nextInt();
		 
		 
		 System.out.println("Enter the dinaminator");
		 
		 int b=scan.nextInt();
		 
		 int c=a/b;
		 }
		 catch(Exception e) {
			 System.out.println("The exceptions is handled is inside a method");
			 throw e;
		 }
	       System.out.println("connection is terminated ");	 

	}
}



public class Test3 {

	public static void main(String[] args) {
		    
		Fun1 f=new Fun1();
         
		f.fun();
         
         /*catch(Exception e) {
        	 System.out.println("The exceptions is handles in main");
        	 
         }*/
	}

}

