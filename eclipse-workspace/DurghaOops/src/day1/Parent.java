package day1;


  class A{
	
	String name="Tamil selvan";
	
	protected String  s="tamil";
	
	protected void m1() {
		System.out.println("A class");
	}
}



public class Parent  extends A{
	
	public static void main(String[] args){
		
		A P=new Parent();
		
		A aa=new A();
		
		System.out.println(P.s);
		
		//System.out.println(aa.m1());
		
		aa.m1();
		
	}
	
}





