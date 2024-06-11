package com.tamil.package1;

import java.util.Scanner;
class Trial implements Runnable {
	
public	void run()   {
		
		System.out.println("Addition is starting");
		
		System.out.println("Enter tha a value");
		
		 Scanner scan=new Scanner(System.in);
		
		 int a=scan.nextInt();
		 
		 System.out.println("Enter tha b value");
       		 
		 int b=scan.nextInt();
	
		 System.out.println(a+b);
		 
		 System.out.println("THe main thread"+Thread.currentThread());
		System.out.println("Addition is Ending");
	}
}


class Trial2 implements Runnable{
	
	public  void run() {
		
		for(int i=0;i<11;i++) {
			
			System.out.println(i);
			
			System.out.println("THe main thread"+Thread.currentThread());
		}
		
		
		
	}
	
	
}




class Trial3 implements Runnable{
	
	public  void run() {
		
		for(char i='A';i<80;i++) {
			
			System.out.println(i);
			
			System.out.println("THe main thread"+Thread.currentThread());
		}
		
		
		
	}



}

public class Demoo2 {

	public static void main(String[] args) {
		
		System.out.println("THe main thread"+Thread.currentThread());
		
Trial	t1=new Trial();

Trial2	t2=new Trial2();

Trial3	t3=new Trial3();


 Thread th1=new Thread(t1);

 Thread th2=new Thread(t2);
 
 
 Thread th3=new Thread(t3);
//t1.run();

//t2.run();

//t3.run();

th1.start();


th2.start();

th3.start();



	}

}

