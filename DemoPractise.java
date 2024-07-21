package com.tamil.package3;

class SingleTon{
	
	private static SingleTon t;
	
	private SingleTon() {
		
	}
	
	void fun() {
		
		System.out.println("Hi i am fun method ");
	}
	
	static SingleTon getInstance() {

		if(t==null){
			
			t=new SingleTon();
		}
		
		else
			return t;
		
		return t;
		
			}
	
}

public class DemoPractise {

	public static void main(String[] args) {
		
             SingleTon t1=SingleTon.getInstance(); 	
		
                 t1.fun();
                 
                  SingleTon t2=SingleTon.getInstance();
                  
                  t2.fun();
                 
		
	}
}

