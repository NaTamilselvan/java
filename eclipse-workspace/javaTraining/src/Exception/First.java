package Exception;

import java.util.*;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		   Scanner scan=new Scanner(System.in);
	 First	f=new First();
    try {
	 int a=scan.nextInt();
	 int b=scan.nextInt();
	 
	 int[]  arr=new int[a];
	 
	 for(int i=0;i<b;i++) {
		 System.out.println(arr[i]);
	 }
	 
    }                                                         //ArrayIndexOutOfBoundsException  
    catch(ArithmeticException  | NegativeArraySizeException  | ArrayIndexOutOfBoundsException a ) {
               	System.out.println("Give coorect input ");
               	//NegativeArraySizeException e
    }
   
	 
	 
	 
	 
	 
	 f.arith();
	 
	 
	}

	private void arith() {
		// TODO Auto-generated method stub
		try {
	  System.out.println(10/0);
		}
		catch(ArithmeticException ae ){
			System.out.println("Arithmetic exception");
		}
	}

	
}
