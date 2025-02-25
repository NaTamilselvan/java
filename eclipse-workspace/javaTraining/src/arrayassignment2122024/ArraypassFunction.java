package arrayassignment2122024;

import java.util.*;
public class ArraypassFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] a	=new int[5];

	int[] b=getinputArray(a);
	printArray(a);
	
	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		

		for(int i=0;i<a.length;i++) {
			//a[i]=scan.nextInt();
			System.out.println(a[i]);
		}
		
		
		
		
	}

	private   static  int[]  getinputArray(int[] a) {
		// TODO Auto-generated method stub
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array value");
		try {
		
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}}
		catch(InputMismatchException ima) {
			System.out.println("Enter the integer values only");
			
		}
	
         return a;
		
	}
	 

}
