package mytraining;

//required package 
	import java.util.*;

public class Largeplace {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan=new Scanner(System.in);

		 int a;
		 
		 System.out.println("Enter the varaible a value ");
		 
		 a=scan.nextInt();
		 
		 if(a<10) {
			 System.out.println("once place "+a);
			 
		 }
		 else if(a>9 && a <100) {
			 int n=a/10;
			 
			 System.out.println("tens place "+a);
			 
		 }
		 else if(a>99 && a<1000) {
			 
			 int n=a/100;
			 
			 System.out.println("hundred place "+n);
		 }
		 
		 else if(a>999 && a<10000) {
			 
			 int n=a/1000;
			 
			 System.out.println("thousand  place "+n);
		 }
				 
		 
		 
	}

}
