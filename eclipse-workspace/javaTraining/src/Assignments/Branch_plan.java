package Assignments;

public abstract class Branch_plan  extends Headoffice{
	
	public static void main(String[] args) {
		
		System.out.println("Hi i am mainmethod inside ");
		
		//Branch_plan b=new Branch_plan();
		
	}

	public void do_interview() {
	 System.out.print("do interview method");	
	}
	
	
}


/*Create another abstract class called Branch_Plan as sub class of HeadOffice
5. Have main method in it. 
6. Add a print statement inside main method.  
8. Add below method 
- public void do_interview()
  - Have a print statement inside here. 
7. Create another class 'Branch' as sub class of Branch_Plan
8. Handle abstract methods here with print statements. 
9. Create an instance called 'branch' for Branch class. 
10. Confirm the below methods can be called. 
- public void check_accounts(1000)
- public int pay_tax(2000)
  - Check if value is returned. 
- public void do_interview() */