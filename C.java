package com.tamil.package1;

interface A{
	
	public static final int x=10;
	
}
interface B{
	
	public static final int x=100;
	
}
class c implements A,B{
	
	
}

public class Intcheck {

	public static void main(String[] args) {
		
		
		c c1=new c();
		System.out.println(c1.x);
		
	}

}

