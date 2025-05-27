package Basicprogram;

class Traila{
	
	static int a=10;

	static void display() {
		System.out.println("Hi i am display method");
	}
	
	static {
		System.out.println("I am  Triala static block ");
	}
	
}

public class StaticDemo {
	
	
    static int a=10;
	

	public static void main(String[] args) {
		
		Traila t=new Traila();
		
		System.out.println(a);
		
		
		
		System.out.println("I am main method");
		
		
		//Traila t2=new Traila();
		
		//System.out.println(Traila.a);
		
		 Traila.display();
	
	}
	
}
