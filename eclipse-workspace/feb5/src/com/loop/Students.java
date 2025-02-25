package com.loop;

public class Students {

	String name;
	
	int id;
	
	
	public Students(String name, int id) {
		
				this.name=name;
				
				this.id=id;
		
		
	}


	public static void main(String[] args) {
		
		Students s=new Students("Tamil",101);
		
		Students k=s;
		
		System.out.println("The student name"+s.name+" "+s.id);
		
		System.out.println("The student name"+k.name+" "+k.id);

		System.out.println("\b"+"the to change value");
		
		k.name="selvan";
		
		System.out.println(k);
		
		
		System.out.println(s);
		
		
//		System.out.println("\b"+"the to change value");
		
		System.out.println("The student name"+s.name+" "+s.id);
		
		System.out.println("The student name"+k.name+" "+k.id);

		
		System.out.println("\b"+"the to change value ager chafwrk");	
		
		
		k=null;
		

        System.out.println(k);
		
		
		System.out.println(s);
		
		System.out.println("\b"+"thnukklk");

		
		System.out.println("The student name"+s.name+" "+s.id);
		
		System.out.println("The student name"+k.name+" "+k.id);
		
		

	}

}
