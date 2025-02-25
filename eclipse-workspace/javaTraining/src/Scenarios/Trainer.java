package Scenarios;

import java.io.PrintStream;

public class Trainer {
	
	//int apt;
	//static String dept1="All the Department ";
	
	String dept="java",institute="payilagam";
	
	private int salary=10000;
	 
	public Trainer(String dept, String institude) {
		this.dept=dept;
		this.institute=institute;
	}
	public Trainer () {
	   
		System.out.println("Hi i am  TRINER CLASS 0 Argument constructor");
		
	}
	int getSalary(){
		
		System.out.println(this.salary);
		
		return salary;
		
	}
	 void training() {
		 System.out.println("I am trainner");
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer traniner_kumar=  new Trainer("CSE","payilagam");
			 		
             System.out.println(traniner_kumar.dept);
           // PrintStream printStream = new PrintStream(null);
			//printStream.println(Trainer.apt);
             
		
		
	}}

/*Expected Understanding: Access Modifiers, Single Inheritance, getter methods, Constructor Overloading
1) Create a Class named “Trainer”.
– Have default instance variables String dept, institute
– Assign values – “Java”, “Payilagam” to them
– Have private instance variable int salary
– Assign 10000 as value for salary.
– Create getter method for salary.
– Have instance method training() with void as return data type
– Add a print statement inside training() method
- Add main method [public static void main(String[] args)] 
– Have instance named as ‘trainerKumar’ and pass “CSE”, “payilagam” as arguments to it.
– Handle above line with matching Constructor.*/