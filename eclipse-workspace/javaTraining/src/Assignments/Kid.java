package Assignments;

public class Kid  extends Mother  {
	
	
String name="kid ";
	
	//method definition name 
	   public void  work() {
		   System.out.println(name);
		   System.out.println(super.name);
		   
		   
		   System.out.println("This kid ma jobs" );}
	
	
	   public void study() {
		   work();
		   System.out.println("I am stuyding kid ");
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     Kid k=new Kid();
		     
		     k.study();
		     
		
		

	}

}
