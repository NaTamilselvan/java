package Exception;

import java.util.*;
public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan=new Scanner(System.in);
		
		System.out.println("connection establish");
		
		System.out.println("Enter the a value");
		
		try {
		int a=scan.nextInt();
		
        System.out.println("Enter the b value");
		
		int b=scan.nextInt();
		
		int c=a/b;
		
		System.out.println(c);
		}
		catch(ArithmeticException ae) {
			System.out.println("check dinametrator");
			
		}
		System.out.println();
		
		System.out.println("Connection is terminated ");
		
	}

}
