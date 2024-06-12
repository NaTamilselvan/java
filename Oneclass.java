import java.util.Scanner;
class Oneclass extends Thread{
	
	public void run() {
		
		
		System.out.println("i am executing run which thread "+Thread.currentThread());
		
		
	
		    Thread t=Thread.currentThread();
		      
		    String k=t.getName();
		    
		    
		    if(k.equals("NUM")) {
		    	add();
		    	
		    }
		    else if(k.equals("NUM")) {
		    	printNum();
		    }
		    else {
		    	printChar();
		    }
	}
	
	
	public void add() {
		System.out.println("Addtion is start ");
		
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter tha numbers");
		 
		 int a=scan.nextInt();
		 
		 
//		 System.out.println("Enter the numbers");
		 
		 int b=scan.nextInt();
		 
		 System.out.println(a+b);
		 
		 
		 System.out.println("Addtion is end  ");
		 
	}
	
	
	public void printNum() {
		
		System.out.println("The number printiong is start ");
		
		int i=0;
		do {
			
			System.out.println(i);
			i++;
			
			
		}while(i<=10);
		
		
		System.out.println("The number printiong is end ");
	}
	
	public void printChar() {
		
		
 System.out.println("The char printiong is start ");
		
		char ch='a';
		do {
			
			System.out.println(ch);
			ch++;
			
			
		}while(ch<=123);
		
		
		System.out.println("The char printiong is end ");
		
		
	}
}



public class Thread2 {

	public static void main(String[] args) {
		
		
		
		Oneclass t=new Oneclass();
		
		Oneclass t1=new Oneclass();
		
		
		Oneclass t3=new Oneclass();

		
		t.setName("ADD");
		
		t1.setName("NUM");
		
		t3.setName("ChAR");
		
		
		t.start();
		
		t1.start();
		
		t3.start();
		
		
		

		 
	}

}
