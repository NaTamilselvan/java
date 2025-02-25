package Durghasoft.overload;

public class Methodoverload {

	
	
	public int add() {
		
		System.out.println("i am 0 argument method");
		
		return 0;
	}
	
	public int add(int a) {
		
		System.out.println("i am 1 argument method");
		
		return a;
	}
	
	public int add(int a,int b) {
		
		System.out.println("i am 2 argument method");
		
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		
		System.out.println("i am 3 argument method");
		
		return a+b+c;
	}
	
	
	public static void main(String[] args) {
		

		
		Methodoverload m=new Methodoverload();
		
		m.add();
		
		m.add(10);
		
		m.add(10,20);
		
		m.add(30,20,10);
		
		
		
		
		
		
		
	}

}
