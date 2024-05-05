
import java.util.Scanner;

interface Arithmatic{
	
	//interface by default abstract method or incomplete
	
	
	
	public void add();
	
	public void sub();
	
}

class Mycalculation1 implements Arithmatic{

	public void add() {
		
		int a=10,b=30;
		
		System.out.println(a+b);
		
	}
	
	public void sub() {

        int a=10,b=30;
		
		System.out.println(a-b);
		
		
	}
}




class Mycalculation2 implements Arithmatic{

	public void add() {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the a value");
		
		int a=scan.nextInt();
		
		System.out.println("Enter the b value");
		
		int b=scan.nextInt();
		
		System.out.println(a+b);
		
	}
	
	public void sub() {

        
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the a value");
		
		int a=scan.nextInt();
		
		System.out.println("Enter the b value");
		
		int b=scan.nextInt();
		
		System.out.println(a-b);
		
		
		
	}
}



class Math{
	
	public static void  permit(Arithmatic a) {
		
		a.add();
		a.sub();
		
	}
	
	
}






public class Test2 {

	public static void main(String[] args) {
		
		    
		
		Mycalculation1 m=  new Mycalculation1();

		Mycalculation2 m2=  new Mycalculation2();

		Math.permit(m);
		
		Math.permit(m2);
		
	}

}

