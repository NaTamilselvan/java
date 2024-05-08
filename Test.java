package com.tamil.package1;
import java.util.InputMismatchException;
import java.util.Scanner;

interface Calculator{

	 public abstract void add();
	 
	  public abstract void sub();
}
 class Cal1  implements Calculator{
	 
	  public void add() {
             int a=5,b=10;
             System.out.println(a+b);
	  }
	  public void sub() {
          int a=5,b=11;
          System.out.println(a-b);		  
	  }
 }

 class Cal2 implements Calculator{
	 
	  public void add() {
		
		  try {
		  Scanner scan=new Scanner(System.in);
		  
		  int a=scan.nextInt();
		  
		  int b=scan.nextInt();
		  
		  
		  System.out.println(a+b);
		  
		  }
		  catch(InputMismatchException  ae) {
			  System.out.println("Check your input ");
		  }
		  
	  }
	  public void sub() {
	
		  
		  try {
			  Scanner scan=new Scanner(System.in);
			  
			  int a=scan.nextInt();
			  
			  int b=scan.nextInt();
			  
			  
			  System.out.println(a-b);
			  
			  }
			  catch(InputMismatchException  ae) {
				  System.out.println("Check your input ");
			  }
		  
	  }
	  public void mul() {
		  int a=4,b=23;
		  int c=a*b;
	  }
	 
 }
 
 abstract class Cal3 implements Calculator{
	 
	 public void add() {
		 
	 }
 }
 
 class Math{
	 public static void permit(Calculator c) {
		 c.add();
		 c.sub();
		// c.mul();
	 }
 }
public class test {

	public static void main(String[] args) {
		
		      Cal1 c=new Cal1();  //tight coupling we cannot achieve polymorphism
		      
		      Cal1 c2=new Cal1();
                
		      Math.permit(c);
		      
		      Math.permit(c2);
		      
	}

}

