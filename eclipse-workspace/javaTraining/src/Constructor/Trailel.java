package Constructor;

class A{
	int marks;
	public int test;/*
	A(int a){
		this();
		System.out.println("I am A class intger constructor");
   this.marks =a;
	}  */

	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("I am A class constructor ");
	}
	
}


class B extends A{
 
	B(int a){
		
		int b=a;
		
	System.out.println("integer constructor  %d"+b);
	
}
	
}

public class Trailel {
	int test;
	public static void main(String[] args) {
		 
		
		//B a=new B();
		
		//A b=new A(10);
		
		//test=10;
	}

}
