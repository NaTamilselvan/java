package com.loop;

abstract class vechicle{

	//creating a abstract class
	public abstract void start();
	
	public abstract void accelarate();
	
	public abstract void applybreak();
	
	
	
}



public class Abclass extends vechicle {

	@Override
	public void start() {
		
		System.out.println("Started ");
	}

	@Override
	public void accelarate() {
		
		System.out.println("accelarate ");
		
	}

	@Override
	public void applybreak() {
		System.out.println("breaks ");
		
	}
	
	
	public static void main(String[] args) {
		
		 Abclass s=  new Abclass();
		 
		 System.out.println("HI i am software engineer");
		 s.accelarate();
		 s.start();
		 s.accelarate();
		
	}

}
