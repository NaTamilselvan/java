package com.loop;

public class Check {

	int a,b;
	
	public static void main(String[] args) {
		
		
		
		int a=10;
		//ch is Check type 
		Check ch =new Check();
		
		Check ch3 =new Check();
		
		Check ch1=ch;
		
		ch.a=8;
		
		ch.b=5;
		
		System.out.println(ch1);
		
		System.out.println(ch);
		
		System.out.println(ch3);
		
		ch1.b=56;
		
		
		System.out.println(ch.a+ " "+ch.b);
		
		
		Integer n=9;
		
		Integer k=n;
		
		System.out.println(n);
		
		
		System.out.println(k);
		

	}

}
